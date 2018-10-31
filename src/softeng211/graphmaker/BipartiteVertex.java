package softeng211.graphmaker;

/**
 * This is particularly important as a vertex in a bipartite graph contains special information.
 */
public class BipartiteVertex extends Vertex {
    //Determines which player this vertex belongs to.
    public enum Player{ONE,TWO}
    private Player _player;
    public BipartiteVertex(int x, int y) {
        super(x, y);
    }

    public void setPlayer(Player player) {
        _player = player;
    }

    public Player getPlayer() {
        return _player;
    }
}
