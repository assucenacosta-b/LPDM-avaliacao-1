# Cartão de Perfil Profissional — LPDM-avaliacao-1

App Android feito em **Kotlin** com **Jetpack Compose**. Ele mostra na tela um cartão de perfil profissional, no estilo do app "Business Card" que fizemos em aula.

## O que o app faz

Em uma única tela, o app mostra:

- uma **foto** no topo;
- uma **saudação** grande e centralizada ("Hi there!!"), escrita por cima da foto;
- o **nome completo** (letra maior, em negrito) e o **cargo** (letra menor);
- uma seção **"Sobre"** com uma frase curta de apresentação;
- **3 contatos** (e-mail, telefone e site/GitHub), cada um com um ícone do Material Icons do lado do texto;
- um **fundo rosa** (cor escolhida, diferente do branco).

## Tecnologias usadas

- **Kotlin** (1.9.24)
- **Jetpack Compose** com **Material 3** (Compose BOM 2024.09.00)
- **Android Studio Ladybug 2024.2.1** (versão da IDE usada)
- **Gradle 8.7** / **Android Gradle Plugin 8.5.x**
- **Min SDK 24** e **Target SDK 35**
- Só Compose: **nenhum XML de layout**

## Como compilar e executar

Antes de começar, você precisa ter:
- o **Android Studio** instalado (Ladybug 2024.2.1 ou mais novo);
- o **JDK 17** (já vem junto com o Android Studio);
- o **SDK do Android** com a **API 35** instalada;
- internet para baixar as dependências na primeira vez.

Passo a passo:

1. Copie o projeto para o seu computador:

   ```bash
   git clone https://github.com/assucenacosta-bLPDM-avaliacao-1.git
   cd LPDM-avaliacao-1
   ```

2. Abra o Android Studio em `File > Open...` e escolha a pasta do projeto. Espere o **Gradle Sync** terminar.

3. Crie um emulador em `Tools > Device Manager > Create Device` (ex.: Pixel 7, API 35). Ou ligue um celular no USB com a **Depuração USB** ativada.

4. Clique no botão **Run ▶** (`Shift + F10`). Ou pelo terminal:

   ```bash
   ./gradlew assembleDebug
   ./gradlew installDebug
   ```

5. O app deve abrir direto no cartão de perfil, sem travar.

> Obs.: o ícone `Icons.Default.Web` precisa da dependência abaixo no `app/build.gradle.kts`.
>
> ```kotlin
> implementation("androidx.compose.material:material-icons-extended")
> ```

## Arquivos do projeto

| Arquivo | O que faz |
|---|---|
| `MainActivity.kt` | O arquivo principal da tela. Tem a `MainActivity`, a `BusinessCard`, a `ContactRow` e a pré-visualização. |
| `res/drawable/imagemm.*` | A foto usada no topo da tela. |
| `AndroidManifest.xml` | Abre a `MainActivity` quando o app inicia. |
| `build.gradle.kts` | Configurações e dependências do app. |
| `README.md` | Este arquivo. |
| `.gitignore` | Lista de arquivos que não devem subir para o GitHub. |

## Funções do código (composables)

| Função | O que ela faz |
|---|---|
| `MainActivity` | Ponto de entrada do app. Chama a `BusinessCard` dentro do `setContent { }`. |
| `BusinessCard(...)` | Monta a tela inteira: fundo rosa, foto, saudação, nome, cargo, "Sobre" e os contatos. Usa um `Column`. |
| `ContactRow(icon, text)` | Função criada para não repetir código: desenha **uma linha de contato** (ícone + texto). É usada 3 vezes (e-mail, telefone e site). |
| `BusinessCardPreview()` | Mostra o cartão dentro do Android Studio, sem precisar rodar o app. |

## Hierarquia dos composables

```
BusinessCard                  (Column, fundo rosa)
├── Image                     (a foto)
├── Box                       (coloca a saudação por cima da foto)
│   ├── Image
│   └── Text                  (saudação "Hi there!!")
├── Text                      (nome completo)
├── Text                      (cargo)
├── Text                      ("Sobre")
├── Text                      (frase de apresentação)
├── ContactRow                (ícone e-mail + texto)
├── ContactRow                (ícone telefone + texto)
└── ContactRow                (ícone site + texto)
```

## Autor

- **Aluno:** Assucena Costa Belarmino dos Reis
- **Turma:** 3º Módulo — Laboratório de Programação para Dispositivos Móveis (LPDM)
- **Professor:** MSc Rodrigo de Lima Cunha
