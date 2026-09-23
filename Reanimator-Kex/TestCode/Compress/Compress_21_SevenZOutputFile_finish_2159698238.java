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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SevenZOutputFile_finish_2159698238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4365;

    public SevenZOutputFile_finish_2159698238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4370 = new ArrayList();
        ((ArrayList) term4370).add((Object)null);
        ((ArrayList) term4370).add((Object)null);
        ((ArrayList) term4370).add((Object)null);
        ((ArrayList) term4370).add((Object)null);
        ((ArrayList) term4370).add((Object)null);
        ((ArrayList) term4370).add((Object)null);
        ((ArrayList) term4370).add((Object)null);
        ((ArrayList) term4370).add((Object)null);
        Object term4393 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term4393, term4393.getClass(), "name", "");
        setBooleanField(term4393, term4393.getClass(), "hasStream", false);
        setBooleanField(term4393, term4393.getClass(), "isDirectory", true);
        setBooleanField(term4393, term4393.getClass(), "isAntiItem", true);
        setBooleanField(term4393, term4393.getClass(), "hasCreationDate", false);
        setBooleanField(term4393, term4393.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term4393, term4393.getClass(), "hasAccessDate", true);
        setLongField(term4393, term4393.getClass(), "creationDate", -7698746988132548371L);
        setLongField(term4393, term4393.getClass(), "lastModifiedDate", 2145420811068634601L);
        setLongField(term4393, term4393.getClass(), "accessDate", 2191130532479601175L);
        setBooleanField(term4393, term4393.getClass(), "hasWindowsAttributes", false);
        setIntField(term4393, term4393.getClass(), "windowsAttributes", -1588772968);
        setBooleanField(term4393, term4393.getClass(), "hasCrc", false);
        setLongField(term4393, term4393.getClass(), "crc", 860079646007397083L);
        setLongField(term4393, term4393.getClass(), "compressedCrc", 3230472384687362867L);
        setLongField(term4393, term4393.getClass(), "size", -1145146470850585022L);
        setLongField(term4393, term4393.getClass(), "compressedSize", 1993646237353405740L);
        Object term4411 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term4411, term4411.getClass(), "name", "");
        setBooleanField(term4411, term4411.getClass(), "hasStream", false);
        setBooleanField(term4411, term4411.getClass(), "isDirectory", false);
        setBooleanField(term4411, term4411.getClass(), "isAntiItem", false);
        setBooleanField(term4411, term4411.getClass(), "hasCreationDate", false);
        setBooleanField(term4411, term4411.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term4411, term4411.getClass(), "hasAccessDate", true);
        setLongField(term4411, term4411.getClass(), "creationDate", -4043093655001688454L);
        setLongField(term4411, term4411.getClass(), "lastModifiedDate", -419800263764810394L);
        setLongField(term4411, term4411.getClass(), "accessDate", 5904678961906211249L);
        setBooleanField(term4411, term4411.getClass(), "hasWindowsAttributes", true);
        setIntField(term4411, term4411.getClass(), "windowsAttributes", -93135961);
        setBooleanField(term4411, term4411.getClass(), "hasCrc", false);
        setLongField(term4411, term4411.getClass(), "crc", -1820639665251914495L);
        setLongField(term4411, term4411.getClass(), "compressedCrc", 3238645206498300107L);
        setLongField(term4411, term4411.getClass(), "size", -1592696983130738594L);
        setLongField(term4411, term4411.getClass(), "compressedSize", 6902365338255307910L);
        Object term4429 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term4429, term4429.getClass(), "name", "");
        setBooleanField(term4429, term4429.getClass(), "hasStream", true);
        setBooleanField(term4429, term4429.getClass(), "isDirectory", true);
        setBooleanField(term4429, term4429.getClass(), "isAntiItem", true);
        setBooleanField(term4429, term4429.getClass(), "hasCreationDate", true);
        setBooleanField(term4429, term4429.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term4429, term4429.getClass(), "hasAccessDate", true);
        setLongField(term4429, term4429.getClass(), "creationDate", -8019730974733786399L);
        setLongField(term4429, term4429.getClass(), "lastModifiedDate", 394960377236392159L);
        setLongField(term4429, term4429.getClass(), "accessDate", -2955854401507097864L);
        setBooleanField(term4429, term4429.getClass(), "hasWindowsAttributes", true);
        setIntField(term4429, term4429.getClass(), "windowsAttributes", -112921587);
        setBooleanField(term4429, term4429.getClass(), "hasCrc", true);
        setLongField(term4429, term4429.getClass(), "crc", 329213208496958131L);
        setLongField(term4429, term4429.getClass(), "compressedCrc", 8107921244631636572L);
        setLongField(term4429, term4429.getClass(), "size", -7904053112604879960L);
        setLongField(term4429, term4429.getClass(), "compressedSize", -6602460430714339690L);
        Object term4447 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term4447, term4447.getClass(), "name", "");
        setBooleanField(term4447, term4447.getClass(), "hasStream", false);
        setBooleanField(term4447, term4447.getClass(), "isDirectory", false);
        setBooleanField(term4447, term4447.getClass(), "isAntiItem", false);
        setBooleanField(term4447, term4447.getClass(), "hasCreationDate", true);
        setBooleanField(term4447, term4447.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term4447, term4447.getClass(), "hasAccessDate", false);
        setLongField(term4447, term4447.getClass(), "creationDate", 21047099434645581L);
        setLongField(term4447, term4447.getClass(), "lastModifiedDate", -8862087040734407227L);
        setLongField(term4447, term4447.getClass(), "accessDate", -6394943900800506753L);
        setBooleanField(term4447, term4447.getClass(), "hasWindowsAttributes", false);
        setIntField(term4447, term4447.getClass(), "windowsAttributes", 933028652);
        setBooleanField(term4447, term4447.getClass(), "hasCrc", false);
        setLongField(term4447, term4447.getClass(), "crc", -4867941246533901410L);
        setLongField(term4447, term4447.getClass(), "compressedCrc", 1044883697493326351L);
        setLongField(term4447, term4447.getClass(), "size", -7406618974062419277L);
        setLongField(term4447, term4447.getClass(), "compressedSize", 868503089567085985L);
        Object term4465 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term4465, term4465.getClass(), "name", "");
        setBooleanField(term4465, term4465.getClass(), "hasStream", false);
        setBooleanField(term4465, term4465.getClass(), "isDirectory", true);
        setBooleanField(term4465, term4465.getClass(), "isAntiItem", true);
        setBooleanField(term4465, term4465.getClass(), "hasCreationDate", true);
        setBooleanField(term4465, term4465.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term4465, term4465.getClass(), "hasAccessDate", false);
        setLongField(term4465, term4465.getClass(), "creationDate", -3277773415369003529L);
        setLongField(term4465, term4465.getClass(), "lastModifiedDate", 1253549421411622358L);
        setLongField(term4465, term4465.getClass(), "accessDate", 3666226122807672448L);
        setBooleanField(term4465, term4465.getClass(), "hasWindowsAttributes", true);
        setIntField(term4465, term4465.getClass(), "windowsAttributes", 287287233);
        setBooleanField(term4465, term4465.getClass(), "hasCrc", false);
        setLongField(term4465, term4465.getClass(), "crc", 3108750145697087661L);
        setLongField(term4465, term4465.getClass(), "compressedCrc", 3752337209837437327L);
        setLongField(term4465, term4465.getClass(), "size", 1860789353508856614L);
        setLongField(term4465, term4465.getClass(), "compressedSize", -7456852906235966771L);
        Object term4483 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term4483, term4483.getClass(), "name", "");
        setBooleanField(term4483, term4483.getClass(), "hasStream", false);
        setBooleanField(term4483, term4483.getClass(), "isDirectory", true);
        setBooleanField(term4483, term4483.getClass(), "isAntiItem", true);
        setBooleanField(term4483, term4483.getClass(), "hasCreationDate", true);
        setBooleanField(term4483, term4483.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term4483, term4483.getClass(), "hasAccessDate", true);
        setLongField(term4483, term4483.getClass(), "creationDate", -67485388932970712L);
        setLongField(term4483, term4483.getClass(), "lastModifiedDate", 5806367330808555223L);
        setLongField(term4483, term4483.getClass(), "accessDate", 4576699120365923235L);
        setBooleanField(term4483, term4483.getClass(), "hasWindowsAttributes", false);
        setIntField(term4483, term4483.getClass(), "windowsAttributes", 962840079);
        setBooleanField(term4483, term4483.getClass(), "hasCrc", true);
        setLongField(term4483, term4483.getClass(), "crc", -1635471392209071620L);
        setLongField(term4483, term4483.getClass(), "compressedCrc", -4714000263923324167L);
        setLongField(term4483, term4483.getClass(), "size", 6906379511067694917L);
        setLongField(term4483, term4483.getClass(), "compressedSize", -9204303423581447271L);
        ArrayList term4391 = new ArrayList();
        ((ArrayList) term4391).add(term4393);
        ((ArrayList) term4391).add(term4411);
        ((ArrayList) term4391).add(term4429);
        ((ArrayList) term4391).add(term4447);
        ((ArrayList) term4391).add(term4465);
        ((ArrayList) term4391).add(term4483);
        Class<? extends Object> term21984 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term21983 = ((Class) term21984).getDeclaredField((String) "DEFLATE");
        ((Field) term21983).setAccessible(true);
        Object enum50 = ((Field) term21983).get((Object) null);
        term4365 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term4366 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term4367 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term4389 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term4504 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term4506 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term4510 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term4513 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term4367, term4367.getClass(), "fd", -1);
        setLongField(term4367, term4367.getClass(), "handle", -1L);
        setField(term4367, term4367.getClass(), "parent", null);
        setField(term4367, term4367.getClass(), "otherParents", term4370);
        setBooleanField(term4367, term4367.getClass(), "closed", false);
        setBooleanField(term4367, term4367.getClass(), "append", true);
        setField(term4367, term4367.getClass(), "cleanup", null);
        setField(term4366, term4366.getClass(), "fd", term4367);
        setField(term4366, term4366.getClass(), "channel", null);
        setBooleanField(term4366, term4366.getClass(), "rw", false);
        setField(term4366, term4366.getClass(), "path", "aKnKipADSo");
        setIntField(term4389, term4389.getClass(), "value", 1324040357);
        setField(term4366, term4366.getClass(), "closed", term4389);
        setField(term4365, term4365.getClass(), "file", term4366);
        setField(term4365, term4365.getClass(), "files", term4391);
        setIntField(term4365, term4365.getClass(), "numNonEmptyStreams", 1540719661);
        setIntField(term4504, term4504.getClass(), "crc", 1265463001);
        setField(term4365, term4365.getClass(), "crc32", term4504);
        setIntField(term4506, term4506.getClass(), "crc", 335112684);
        setField(term4365, term4365.getClass(), "compressedCrc32", term4506);
        setLongField(term4365, term4365.getClass(), "fileBytesWritten", 6248239231585852341L);
        setBooleanField(term4365, term4365.getClass(), "finished", false);
        setLongField(term4510, term4510.getClass(), "bytesWritten", -88538481937688851L);
        setField(term4510, term4510.getClass(), "out", null);
        setBooleanField(term4510, term4510.getClass(), "closed", true);
        setField(term4510, term4510.getClass(), "closeLock", term4513);
        setField(term4365, term4365.getClass(), "currentOutputStream", term4510);
        setField(term4365, term4365.getClass(), "contentCompression", enum50);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term4365, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


