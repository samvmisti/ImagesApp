package com.samvgorode.shiftfourimages.domain.favorite

import com.samvgorode.shiftfourimages.presentation.ImageUiModel

interface SetImageFavoriteUseCase {
    suspend operator fun invoke(imageUiModel: ImageUiModel)
}