import usecases.CarsListUseCase

class CarsListUseCaseImpl(

): CarsListUseCase {

    override suspend fun execute(): List<String> {
        return emptyList()
    }
}