package org.katandika.butandisi.data

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase
import org.katandika.butandisi.data.dao.DownloadDao
import org.katandika.butandisi.data.dao.ServerDao
import org.katandika.butandisi.data.dao.UserDao
import org.katandika.butandisi.data.entity.DownloadEntity
import org.katandika.butandisi.data.entity.ServerEntity
import org.katandika.butandisi.data.entity.UserEntity

@Database(
    entities = [
        ServerEntity::class,
        UserEntity::class,
        DownloadEntity::class,
    ],
    version = 3,
    autoMigrations = [
        AutoMigration(from = 2, to = 3),
    ],
)
abstract class JellyfinDatabase : RoomDatabase() {
    abstract val serverDao: ServerDao
    abstract val userDao: UserDao
    abstract val downloadDao: DownloadDao
}
