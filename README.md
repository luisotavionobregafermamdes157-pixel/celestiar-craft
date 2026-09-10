# Celestiar Launcher

Launcher open-source para Minecraft Java, inspirado na arquitetura de launchers modernos, mas escrito do zero e sem copiar código proprietário da Mojang.

## Objetivos
- Descobrir automaticamente as versões disponíveis pelo manifest oficial do Minecraft.
- Selecionar versões antigas, releases, snapshots e outras versões publicadas no manifest.
- Login Microsoft usando o fluxo oficial.
- Instâncias separadas por versão.
- Download dos assets, libraries e client oficiais da versão selecionada.
- Suporte a Fabric, Forge, NeoForge e Quilt como módulos futuros.
- Interface simples com botão Jogar, seleção de versão e gerenciamento de instâncias.

## Importante
Este projeto não inclui arquivos proprietários do Minecraft nem contorna autenticação. Os arquivos do jogo são obtidos dos serviços oficiais e o usuário precisa possuir acesso legítimo ao Minecraft Java Edition.

## Base técnica
A arquitetura é inspirada em projetos open-source de launchers, como PrismLauncher, e usa o manifest de versões do Minecraft para manter a lista atualizada. O código deste projeto será original.

## Roadmap
1. Interface desktop.
2. Microsoft OAuth.
3. Version resolver e downloader.
4. Classpath e argumentos JVM.
5. Instâncias e configurações por versão.
6. Mod loaders.
7. Builds para Windows, Linux e macOS.
