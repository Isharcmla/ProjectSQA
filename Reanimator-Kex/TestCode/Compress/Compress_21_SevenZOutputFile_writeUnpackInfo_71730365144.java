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

public class SevenZOutputFile_writeUnpackInfo_71730365144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6987;

    public SevenZOutputFile_writeUnpackInfo_71730365144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6992 = new ArrayList();
        ((ArrayList) term6992).add((Object)null);
        ((ArrayList) term6992).add((Object)null);
        ((ArrayList) term6992).add((Object)null);
        ((ArrayList) term6992).add((Object)null);
        ((ArrayList) term6992).add((Object)null);
        ((ArrayList) term6992).add((Object)null);
        Object term7015 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7015, term7015.getClass(), "name", "");
        setBooleanField(term7015, term7015.getClass(), "hasStream", false);
        setBooleanField(term7015, term7015.getClass(), "isDirectory", false);
        setBooleanField(term7015, term7015.getClass(), "isAntiItem", true);
        setBooleanField(term7015, term7015.getClass(), "hasCreationDate", true);
        setBooleanField(term7015, term7015.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7015, term7015.getClass(), "hasAccessDate", true);
        setLongField(term7015, term7015.getClass(), "creationDate", -1571034605670661708L);
        setLongField(term7015, term7015.getClass(), "lastModifiedDate", -7983954942068142191L);
        setLongField(term7015, term7015.getClass(), "accessDate", 2274723545906746965L);
        setBooleanField(term7015, term7015.getClass(), "hasWindowsAttributes", false);
        setIntField(term7015, term7015.getClass(), "windowsAttributes", 1532716628);
        setBooleanField(term7015, term7015.getClass(), "hasCrc", true);
        setLongField(term7015, term7015.getClass(), "crc", 1353683663053784647L);
        setLongField(term7015, term7015.getClass(), "compressedCrc", -1465819833800717311L);
        setLongField(term7015, term7015.getClass(), "size", -8306611953768020559L);
        setLongField(term7015, term7015.getClass(), "compressedSize", -8692119547314358088L);
        Object term7033 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7033, term7033.getClass(), "name", "");
        setBooleanField(term7033, term7033.getClass(), "hasStream", false);
        setBooleanField(term7033, term7033.getClass(), "isDirectory", false);
        setBooleanField(term7033, term7033.getClass(), "isAntiItem", true);
        setBooleanField(term7033, term7033.getClass(), "hasCreationDate", true);
        setBooleanField(term7033, term7033.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term7033, term7033.getClass(), "hasAccessDate", false);
        setLongField(term7033, term7033.getClass(), "creationDate", -2083524977884307536L);
        setLongField(term7033, term7033.getClass(), "lastModifiedDate", -2691996476200751382L);
        setLongField(term7033, term7033.getClass(), "accessDate", -3806202176947356197L);
        setBooleanField(term7033, term7033.getClass(), "hasWindowsAttributes", false);
        setIntField(term7033, term7033.getClass(), "windowsAttributes", -1801760683);
        setBooleanField(term7033, term7033.getClass(), "hasCrc", true);
        setLongField(term7033, term7033.getClass(), "crc", -5534222035915952617L);
        setLongField(term7033, term7033.getClass(), "compressedCrc", 8073378116544724166L);
        setLongField(term7033, term7033.getClass(), "size", -8303973304709662279L);
        setLongField(term7033, term7033.getClass(), "compressedSize", 6853972830905120647L);
        Object term7051 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7051, term7051.getClass(), "name", "");
        setBooleanField(term7051, term7051.getClass(), "hasStream", true);
        setBooleanField(term7051, term7051.getClass(), "isDirectory", false);
        setBooleanField(term7051, term7051.getClass(), "isAntiItem", true);
        setBooleanField(term7051, term7051.getClass(), "hasCreationDate", false);
        setBooleanField(term7051, term7051.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term7051, term7051.getClass(), "hasAccessDate", false);
        setLongField(term7051, term7051.getClass(), "creationDate", 1442167273909860961L);
        setLongField(term7051, term7051.getClass(), "lastModifiedDate", 6895382576300001141L);
        setLongField(term7051, term7051.getClass(), "accessDate", 9062006526792682783L);
        setBooleanField(term7051, term7051.getClass(), "hasWindowsAttributes", false);
        setIntField(term7051, term7051.getClass(), "windowsAttributes", 1141317871);
        setBooleanField(term7051, term7051.getClass(), "hasCrc", false);
        setLongField(term7051, term7051.getClass(), "crc", -7400951017937830861L);
        setLongField(term7051, term7051.getClass(), "compressedCrc", -8993073054427011802L);
        setLongField(term7051, term7051.getClass(), "size", 2287785643837657068L);
        setLongField(term7051, term7051.getClass(), "compressedSize", -7283193381993602128L);
        Object term7069 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7069, term7069.getClass(), "name", "");
        setBooleanField(term7069, term7069.getClass(), "hasStream", true);
        setBooleanField(term7069, term7069.getClass(), "isDirectory", false);
        setBooleanField(term7069, term7069.getClass(), "isAntiItem", true);
        setBooleanField(term7069, term7069.getClass(), "hasCreationDate", true);
        setBooleanField(term7069, term7069.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7069, term7069.getClass(), "hasAccessDate", true);
        setLongField(term7069, term7069.getClass(), "creationDate", 6351887424140565471L);
        setLongField(term7069, term7069.getClass(), "lastModifiedDate", 6273670659288205855L);
        setLongField(term7069, term7069.getClass(), "accessDate", -4776514981294468834L);
        setBooleanField(term7069, term7069.getClass(), "hasWindowsAttributes", false);
        setIntField(term7069, term7069.getClass(), "windowsAttributes", 890669485);
        setBooleanField(term7069, term7069.getClass(), "hasCrc", false);
        setLongField(term7069, term7069.getClass(), "crc", -7273680182770718108L);
        setLongField(term7069, term7069.getClass(), "compressedCrc", -421166328269063791L);
        setLongField(term7069, term7069.getClass(), "size", 4811527754205378980L);
        setLongField(term7069, term7069.getClass(), "compressedSize", 9174730812791817537L);
        Object term7087 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7087, term7087.getClass(), "name", "");
        setBooleanField(term7087, term7087.getClass(), "hasStream", true);
        setBooleanField(term7087, term7087.getClass(), "isDirectory", false);
        setBooleanField(term7087, term7087.getClass(), "isAntiItem", false);
        setBooleanField(term7087, term7087.getClass(), "hasCreationDate", true);
        setBooleanField(term7087, term7087.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term7087, term7087.getClass(), "hasAccessDate", true);
        setLongField(term7087, term7087.getClass(), "creationDate", 8024477479047145752L);
        setLongField(term7087, term7087.getClass(), "lastModifiedDate", 7006402814669334483L);
        setLongField(term7087, term7087.getClass(), "accessDate", -4003544865306793676L);
        setBooleanField(term7087, term7087.getClass(), "hasWindowsAttributes", false);
        setIntField(term7087, term7087.getClass(), "windowsAttributes", 691577392);
        setBooleanField(term7087, term7087.getClass(), "hasCrc", false);
        setLongField(term7087, term7087.getClass(), "crc", -769824408235898287L);
        setLongField(term7087, term7087.getClass(), "compressedCrc", -2828343143039517941L);
        setLongField(term7087, term7087.getClass(), "size", 2809748481176687920L);
        setLongField(term7087, term7087.getClass(), "compressedSize", 4012955251407483889L);
        Object term7105 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term7105, term7105.getClass(), "name", "");
        setBooleanField(term7105, term7105.getClass(), "hasStream", true);
        setBooleanField(term7105, term7105.getClass(), "isDirectory", true);
        setBooleanField(term7105, term7105.getClass(), "isAntiItem", true);
        setBooleanField(term7105, term7105.getClass(), "hasCreationDate", false);
        setBooleanField(term7105, term7105.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term7105, term7105.getClass(), "hasAccessDate", true);
        setLongField(term7105, term7105.getClass(), "creationDate", -4058686252500969842L);
        setLongField(term7105, term7105.getClass(), "lastModifiedDate", 6077991958696417121L);
        setLongField(term7105, term7105.getClass(), "accessDate", -5004803270846838598L);
        setBooleanField(term7105, term7105.getClass(), "hasWindowsAttributes", false);
        setIntField(term7105, term7105.getClass(), "windowsAttributes", -893623680);
        setBooleanField(term7105, term7105.getClass(), "hasCrc", false);
        setLongField(term7105, term7105.getClass(), "crc", -8211859616692114655L);
        setLongField(term7105, term7105.getClass(), "compressedCrc", 7487838449539103993L);
        setLongField(term7105, term7105.getClass(), "size", 7010148136855890340L);
        setLongField(term7105, term7105.getClass(), "compressedSize", -6771377873268167033L);
        ArrayList term7013 = new ArrayList();
        ((ArrayList) term7013).add(term7015);
        ((ArrayList) term7013).add(term7033);
        ((ArrayList) term7013).add(term7051);
        ((ArrayList) term7013).add(term7069);
        ((ArrayList) term7013).add(term7087);
        ((ArrayList) term7013).add(term7105);
        Class<? extends Object> term28953 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term28952 = ((Class) term28953).getDeclaredField((String) "BZIP2");
        ((Field) term28952).setAccessible(true);
        Object enum59 = ((Field) term28952).get((Object) null);
        term6987 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term6988 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term6989 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term7011 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term7126 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term7128 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term7132 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term7135 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term6989, term6989.getClass(), "fd", -1);
        setLongField(term6989, term6989.getClass(), "handle", -1L);
        setField(term6989, term6989.getClass(), "parent", null);
        setField(term6989, term6989.getClass(), "otherParents", term6992);
        setBooleanField(term6989, term6989.getClass(), "closed", true);
        setBooleanField(term6989, term6989.getClass(), "append", false);
        setField(term6989, term6989.getClass(), "cleanup", null);
        setField(term6988, term6988.getClass(), "fd", term6989);
        setField(term6988, term6988.getClass(), "channel", null);
        setBooleanField(term6988, term6988.getClass(), "rw", true);
        setField(term6988, term6988.getClass(), "path", "kBdSllIBVz");
        setIntField(term7011, term7011.getClass(), "value", -341962980);
        setField(term6988, term6988.getClass(), "closed", term7011);
        setField(term6987, term6987.getClass(), "file", term6988);
        setField(term6987, term6987.getClass(), "files", term7013);
        setIntField(term6987, term6987.getClass(), "numNonEmptyStreams", -1963434938);
        setIntField(term7126, term7126.getClass(), "crc", 906181092);
        setField(term6987, term6987.getClass(), "crc32", term7126);
        setIntField(term7128, term7128.getClass(), "crc", 1045657203);
        setField(term6987, term6987.getClass(), "compressedCrc32", term7128);
        setLongField(term6987, term6987.getClass(), "fileBytesWritten", 1278107327214302894L);
        setBooleanField(term6987, term6987.getClass(), "finished", true);
        setLongField(term7132, term7132.getClass(), "bytesWritten", 3104349415269466587L);
        setField(term7132, term7132.getClass(), "out", null);
        setBooleanField(term7132, term7132.getClass(), "closed", false);
        setField(term7132, term7132.getClass(), "closeLock", term7135);
        setField(term6987, term6987.getClass(), "currentOutputStream", term7132);
        setField(term6987, term6987.getClass(), "contentCompression", enum59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeUnpackInfo", argTypes, term6987, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


