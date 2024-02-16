package usecases

interface CarsListUseCase {
    suspend fun execute(): List<String>
}