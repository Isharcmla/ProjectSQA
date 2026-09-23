package org.apache.commons.compress.archivers.sevenz;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class SevenZOutputFile_write_199670297235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3063;
     Object term3215;

    public SevenZOutputFile_write_199670297235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3068 = new ArrayList();
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        ((ArrayList) term3068).add((Object)null);
        Object term3091 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term3091, term3091.getClass(), "name", "");
        setBooleanField(term3091, term3091.getClass(), "hasStream", false);
        setBooleanField(term3091, term3091.getClass(), "isDirectory", true);
        setBooleanField(term3091, term3091.getClass(), "isAntiItem", false);
        setBooleanField(term3091, term3091.getClass(), "hasCreationDate", true);
        setBooleanField(term3091, term3091.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term3091, term3091.getClass(), "hasAccessDate", false);
        setLongField(term3091, term3091.getClass(), "creationDate", -7278883608542636188L);
        setLongField(term3091, term3091.getClass(), "lastModifiedDate", -1539859611880912454L);
        setLongField(term3091, term3091.getClass(), "accessDate", 4100236067313034103L);
        setBooleanField(term3091, term3091.getClass(), "hasWindowsAttributes", true);
        setIntField(term3091, term3091.getClass(), "windowsAttributes", 1876565163);
        setBooleanField(term3091, term3091.getClass(), "hasCrc", true);
        setLongField(term3091, term3091.getClass(), "crc", 1195529027276497124L);
        setLongField(term3091, term3091.getClass(), "compressedCrc", -2783999800714825789L);
        setLongField(term3091, term3091.getClass(), "size", 4266570509071948633L);
        setLongField(term3091, term3091.getClass(), "compressedSize", -7291742736502427077L);
        Object term3109 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term3109, term3109.getClass(), "name", "");
        setBooleanField(term3109, term3109.getClass(), "hasStream", true);
        setBooleanField(term3109, term3109.getClass(), "isDirectory", true);
        setBooleanField(term3109, term3109.getClass(), "isAntiItem", true);
        setBooleanField(term3109, term3109.getClass(), "hasCreationDate", true);
        setBooleanField(term3109, term3109.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term3109, term3109.getClass(), "hasAccessDate", true);
        setLongField(term3109, term3109.getClass(), "creationDate", -8121849829073967555L);
        setLongField(term3109, term3109.getClass(), "lastModifiedDate", 5219030281405653303L);
        setLongField(term3109, term3109.getClass(), "accessDate", -8471550651709805183L);
        setBooleanField(term3109, term3109.getClass(), "hasWindowsAttributes", true);
        setIntField(term3109, term3109.getClass(), "windowsAttributes", -817164822);
        setBooleanField(term3109, term3109.getClass(), "hasCrc", false);
        setLongField(term3109, term3109.getClass(), "crc", -948292411727204525L);
        setLongField(term3109, term3109.getClass(), "compressedCrc", -8892586408602479513L);
        setLongField(term3109, term3109.getClass(), "size", 4616440478358528406L);
        setLongField(term3109, term3109.getClass(), "compressedSize", 3427570961451840069L);
        Object term3127 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term3127, term3127.getClass(), "name", "");
        setBooleanField(term3127, term3127.getClass(), "hasStream", false);
        setBooleanField(term3127, term3127.getClass(), "isDirectory", true);
        setBooleanField(term3127, term3127.getClass(), "isAntiItem", false);
        setBooleanField(term3127, term3127.getClass(), "hasCreationDate", false);
        setBooleanField(term3127, term3127.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term3127, term3127.getClass(), "hasAccessDate", true);
        setLongField(term3127, term3127.getClass(), "creationDate", 4502292577098212311L);
        setLongField(term3127, term3127.getClass(), "lastModifiedDate", -3730936709704460408L);
        setLongField(term3127, term3127.getClass(), "accessDate", -8614778293741404325L);
        setBooleanField(term3127, term3127.getClass(), "hasWindowsAttributes", false);
        setIntField(term3127, term3127.getClass(), "windowsAttributes", -1016503459);
        setBooleanField(term3127, term3127.getClass(), "hasCrc", false);
        setLongField(term3127, term3127.getClass(), "crc", -5447369594017685765L);
        setLongField(term3127, term3127.getClass(), "compressedCrc", -5724112525188606013L);
        setLongField(term3127, term3127.getClass(), "size", -6100012593724108983L);
        setLongField(term3127, term3127.getClass(), "compressedSize", 5465527210299101732L);
        Object term3145 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term3145, term3145.getClass(), "name", "");
        setBooleanField(term3145, term3145.getClass(), "hasStream", false);
        setBooleanField(term3145, term3145.getClass(), "isDirectory", false);
        setBooleanField(term3145, term3145.getClass(), "isAntiItem", true);
        setBooleanField(term3145, term3145.getClass(), "hasCreationDate", true);
        setBooleanField(term3145, term3145.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term3145, term3145.getClass(), "hasAccessDate", true);
        setLongField(term3145, term3145.getClass(), "creationDate", 4699157009689333952L);
        setLongField(term3145, term3145.getClass(), "lastModifiedDate", -78240609295693193L);
        setLongField(term3145, term3145.getClass(), "accessDate", 3090901538358721367L);
        setBooleanField(term3145, term3145.getClass(), "hasWindowsAttributes", false);
        setIntField(term3145, term3145.getClass(), "windowsAttributes", -1968847291);
        setBooleanField(term3145, term3145.getClass(), "hasCrc", false);
        setLongField(term3145, term3145.getClass(), "crc", -1677189124507026637L);
        setLongField(term3145, term3145.getClass(), "compressedCrc", 4795660804170399986L);
        setLongField(term3145, term3145.getClass(), "size", -4030863184426321096L);
        setLongField(term3145, term3145.getClass(), "compressedSize", -8010214112439224349L);
        Object term3163 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term3163, term3163.getClass(), "name", "");
        setBooleanField(term3163, term3163.getClass(), "hasStream", true);
        setBooleanField(term3163, term3163.getClass(), "isDirectory", false);
        setBooleanField(term3163, term3163.getClass(), "isAntiItem", true);
        setBooleanField(term3163, term3163.getClass(), "hasCreationDate", true);
        setBooleanField(term3163, term3163.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term3163, term3163.getClass(), "hasAccessDate", false);
        setLongField(term3163, term3163.getClass(), "creationDate", -6673920710396545553L);
        setLongField(term3163, term3163.getClass(), "lastModifiedDate", 3412644969878030772L);
        setLongField(term3163, term3163.getClass(), "accessDate", 6698455537431331246L);
        setBooleanField(term3163, term3163.getClass(), "hasWindowsAttributes", true);
        setIntField(term3163, term3163.getClass(), "windowsAttributes", 579005622);
        setBooleanField(term3163, term3163.getClass(), "hasCrc", true);
        setLongField(term3163, term3163.getClass(), "crc", -8327432141027603933L);
        setLongField(term3163, term3163.getClass(), "compressedCrc", -433040798405298080L);
        setLongField(term3163, term3163.getClass(), "size", -1505191021111100819L);
        setLongField(term3163, term3163.getClass(), "compressedSize", -1000830646340880796L);
        ArrayList term3089 = new ArrayList();
        ((ArrayList) term3089).add(term3091);
        ((ArrayList) term3089).add(term3109);
        ((ArrayList) term3089).add(term3127);
        ((ArrayList) term3089).add(term3145);
        ((ArrayList) term3089).add(term3163);
        Class<? extends Object> term19053 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term19052 = ((Class) term19053).getDeclaredField((String) "AES256SHA256");
        ((Field) term19052).setAccessible(true);
        Object enum44 = ((Field) term19052).get((Object) null);
        term3063 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term3064 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term3065 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term3087 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term3184 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term3186 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term3190 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term3193 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term3065, term3065.getClass(), "fd", -1);
        setLongField(term3065, term3065.getClass(), "handle", -1L);
        setField(term3065, term3065.getClass(), "parent", null);
        setField(term3065, term3065.getClass(), "otherParents", term3068);
        setBooleanField(term3065, term3065.getClass(), "closed", true);
        setBooleanField(term3065, term3065.getClass(), "append", true);
        setField(term3065, term3065.getClass(), "cleanup", null);
        setField(term3064, term3064.getClass(), "fd", term3065);
        setField(term3064, term3064.getClass(), "channel", null);
        setBooleanField(term3064, term3064.getClass(), "rw", true);
        setField(term3064, term3064.getClass(), "path", "TEParAifyi");
        setIntField(term3087, term3087.getClass(), "value", -157887805);
        setField(term3064, term3064.getClass(), "closed", term3087);
        setField(term3063, term3063.getClass(), "file", term3064);
        setField(term3063, term3063.getClass(), "files", term3089);
        setIntField(term3063, term3063.getClass(), "numNonEmptyStreams", -14890619);
        setIntField(term3184, term3184.getClass(), "crc", 1632125673);
        setField(term3063, term3063.getClass(), "crc32", term3184);
        setIntField(term3186, term3186.getClass(), "crc", 454281060);
        setField(term3063, term3063.getClass(), "compressedCrc32", term3186);
        setLongField(term3063, term3063.getClass(), "fileBytesWritten", 5973526439563541711L);
        setBooleanField(term3063, term3063.getClass(), "finished", true);
        setLongField(term3190, term3190.getClass(), "bytesWritten", 5246058710498845622L);
        setField(term3190, term3190.getClass(), "out", null);
        setBooleanField(term3190, term3190.getClass(), "closed", true);
        setField(term3190, term3190.getClass(), "closeLock", term3193);
        setField(term3063, term3063.getClass(), "currentOutputStream", term3190);
        setField(term3063, term3063.getClass(), "contentCompression", enum44);
        term3215 = new Integer(-1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3215;
        try {
            callMethod(klass, "write", argTypes, term3063, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


