import Utils.Randomizer;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SampleOfMoves extends SpecialMove {

        public SampleOfMoves(double power, double acc) {
            super(Type.ELECTRIC, power, acc);
        }

        @Override
        protected void applyOppEffects(Pokemon p) {
            super.applyOppEffects(p);
        }

        @Override
        protected void applySelfEffects(Pokemon p) {
            super.applySelfEffects(p);

        }


        @Override
        protected String describe() {
            String[] pieces = this.getClass().toString().split("\\.");
            return "использует " + pieces[pieces.length-1];
        }

}

