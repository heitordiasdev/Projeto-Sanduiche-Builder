package br.edu.catolica.es.subway;

public class SanduicheBuilder implements Builder<SanduicheBuilder,Sanduiche>{

    private final String tipoDePao;
    private String recheio, molho, extra;

    public SanduicheBuilder(String tipoDePao) {
        this.tipoDePao = tipoDePao;
    }

    @Override
    public SanduicheBuilder recheio(String recheio) {
        this.recheio = recheio;
        return this;
    }

    @Override
    public SanduicheBuilder molho(String molho) {
        this.molho = molho;
        return this;
    }

    @Override
    public SanduicheBuilder extra(String extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public Sanduiche create() {
        var sanduiche = new Sanduiche();
        sanduiche.setRecheio(this.recheio);
        sanduiche.setMolho(this.molho);
        sanduiche.setExtra(this.extra);

        return sanduiche;
    }
}
