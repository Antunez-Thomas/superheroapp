package com.example.superheroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroapp.model.Hero

@Composable
fun HeroItem(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        shape = MaterialTheme.shapes.medium,
        modifier = modifier
        ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column(modifier = Modifier.weight(2f)) {
                    Text(
                        text = stringResource(hero.nameRes),
                        style = MaterialTheme.typography.displaySmall
                    )
                    Text(
                        text = stringResource(hero.descriptionRes),
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
                Image(
                    painter = painterResource(hero.imageRes),
                    contentDescription = stringResource(hero.nameRes),
                    modifier = Modifier
                        .size(72.dp)
                        .weight(1f)
                        .padding(start = 16.dp)
                )
            }
        }
    }
}
@Preview
@Composable
fun HeroItemPreview() {
    HeroItem(
        hero = Hero(
            R.string.hero1,
            R.string.description1,
            R.drawable.android_superhero1
        )
    )
}