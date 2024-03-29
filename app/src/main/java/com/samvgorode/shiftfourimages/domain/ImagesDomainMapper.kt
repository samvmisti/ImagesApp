package com.samvgorode.shiftfourimages.domain

import com.samvgorode.shiftfourimages.data.local.ImageEntity
import com.samvgorode.shiftfourimages.presentation.ImageUiModel
import com.samvgorode.shiftfourimages.presentation.ext.orFalse
import javax.inject.Inject

class ImagesDomainMapper @Inject constructor() {

    fun mapToUi(imageEntity: ImageEntity): ImageUiModel = ImageUiModel(
        id = imageEntity.id,
        url = imageEntity.url.orEmpty(),
        favorite = imageEntity.favorite.orFalse()
    )

    fun mapToDomain(image: ImageUiModel): ImageEntity = ImageEntity(
        id = image.id,
        url = image.url,
        favorite = image.favorite
    )
}