package net.smallacademy.songslist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.AuthFailureError;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    LayoutInflater inflater;
    List<Song> songs;

    public Adapter(Context ctx, List<Song> songs){
        this.inflater = LayoutInflater.from(ctx);
        this.songs = songs;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // bind the data
        holder.songTitle.setText(songs.get(position).getTitle());
        holder.songArtists.setText(songs.get(position).getArtists());
        Picasso.get().load(songs.get(position).getCoverImage()).into(holder.songCoverImage);

    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{
        TextView songTitle,songArtists;
        ImageView songCoverImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            songTitle = itemView.findViewById(R.id.songTitle);
            songArtists = itemView.findViewById(R.id.songArtist);
            songCoverImage = itemView.findViewById(R.id.coverImage);

            // handle onClick

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Do Something With this Click", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
