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

public class SevenZOutputFile_writeFileCTimes_192952783652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10667;

    public SevenZOutputFile_writeFileCTimes_192952783652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10672 = new ArrayList();
        ((ArrayList) term10672).add((Object)null);
        ((ArrayList) term10672).add((Object)null);
        ((ArrayList) term10672).add((Object)null);
        ((ArrayList) term10672).add((Object)null);
        ((ArrayList) term10672).add((Object)null);
        ((ArrayList) term10672).add((Object)null);
        Object term10695 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10695, term10695.getClass(), "name", "");
        setBooleanField(term10695, term10695.getClass(), "hasStream", false);
        setBooleanField(term10695, term10695.getClass(), "isDirectory", true);
        setBooleanField(term10695, term10695.getClass(), "isAntiItem", true);
        setBooleanField(term10695, term10695.getClass(), "hasCreationDate", false);
        setBooleanField(term10695, term10695.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term10695, term10695.getClass(), "hasAccessDate", false);
        setLongField(term10695, term10695.getClass(), "creationDate", 3221586604131689186L);
        setLongField(term10695, term10695.getClass(), "lastModifiedDate", -1283936527800858962L);
        setLongField(term10695, term10695.getClass(), "accessDate", -8901189796092679153L);
        setBooleanField(term10695, term10695.getClass(), "hasWindowsAttributes", true);
        setIntField(term10695, term10695.getClass(), "windowsAttributes", 1358829571);
        setBooleanField(term10695, term10695.getClass(), "hasCrc", true);
        setLongField(term10695, term10695.getClass(), "crc", 1731335447688885587L);
        setLongField(term10695, term10695.getClass(), "compressedCrc", -6206610574921547811L);
        setLongField(term10695, term10695.getClass(), "size", -1625372334693179543L);
        setLongField(term10695, term10695.getClass(), "compressedSize", 3778691000276335279L);
        Object term10713 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10713, term10713.getClass(), "name", "");
        setBooleanField(term10713, term10713.getClass(), "hasStream", false);
        setBooleanField(term10713, term10713.getClass(), "isDirectory", false);
        setBooleanField(term10713, term10713.getClass(), "isAntiItem", true);
        setBooleanField(term10713, term10713.getClass(), "hasCreationDate", false);
        setBooleanField(term10713, term10713.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term10713, term10713.getClass(), "hasAccessDate", true);
        setLongField(term10713, term10713.getClass(), "creationDate", 8453730687540121475L);
        setLongField(term10713, term10713.getClass(), "lastModifiedDate", 8505184530074334434L);
        setLongField(term10713, term10713.getClass(), "accessDate", -1610129689783641208L);
        setBooleanField(term10713, term10713.getClass(), "hasWindowsAttributes", false);
        setIntField(term10713, term10713.getClass(), "windowsAttributes", 991356662);
        setBooleanField(term10713, term10713.getClass(), "hasCrc", true);
        setLongField(term10713, term10713.getClass(), "crc", -2613029888948149747L);
        setLongField(term10713, term10713.getClass(), "compressedCrc", -6418282217428803693L);
        setLongField(term10713, term10713.getClass(), "size", -5608790408657117046L);
        setLongField(term10713, term10713.getClass(), "compressedSize", -6265886087280835813L);
        Object term10731 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10731, term10731.getClass(), "name", "");
        setBooleanField(term10731, term10731.getClass(), "hasStream", true);
        setBooleanField(term10731, term10731.getClass(), "isDirectory", false);
        setBooleanField(term10731, term10731.getClass(), "isAntiItem", true);
        setBooleanField(term10731, term10731.getClass(), "hasCreationDate", false);
        setBooleanField(term10731, term10731.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term10731, term10731.getClass(), "hasAccessDate", false);
        setLongField(term10731, term10731.getClass(), "creationDate", 8408467837292297525L);
        setLongField(term10731, term10731.getClass(), "lastModifiedDate", -5157976075409724332L);
        setLongField(term10731, term10731.getClass(), "accessDate", 5638814204437933939L);
        setBooleanField(term10731, term10731.getClass(), "hasWindowsAttributes", true);
        setIntField(term10731, term10731.getClass(), "windowsAttributes", -506958186);
        setBooleanField(term10731, term10731.getClass(), "hasCrc", true);
        setLongField(term10731, term10731.getClass(), "crc", -5717327658642389548L);
        setLongField(term10731, term10731.getClass(), "compressedCrc", 8495724482241106293L);
        setLongField(term10731, term10731.getClass(), "size", -4318584834500248968L);
        setLongField(term10731, term10731.getClass(), "compressedSize", -7839957570751440706L);
        Object term10749 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10749, term10749.getClass(), "name", "");
        setBooleanField(term10749, term10749.getClass(), "hasStream", false);
        setBooleanField(term10749, term10749.getClass(), "isDirectory", true);
        setBooleanField(term10749, term10749.getClass(), "isAntiItem", false);
        setBooleanField(term10749, term10749.getClass(), "hasCreationDate", false);
        setBooleanField(term10749, term10749.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term10749, term10749.getClass(), "hasAccessDate", false);
        setLongField(term10749, term10749.getClass(), "creationDate", -4944032768681866361L);
        setLongField(term10749, term10749.getClass(), "lastModifiedDate", -6657309314982735134L);
        setLongField(term10749, term10749.getClass(), "accessDate", -685001356309682920L);
        setBooleanField(term10749, term10749.getClass(), "hasWindowsAttributes", false);
        setIntField(term10749, term10749.getClass(), "windowsAttributes", -507387516);
        setBooleanField(term10749, term10749.getClass(), "hasCrc", true);
        setLongField(term10749, term10749.getClass(), "crc", -3189918180129674609L);
        setLongField(term10749, term10749.getClass(), "compressedCrc", 5271284328066798769L);
        setLongField(term10749, term10749.getClass(), "size", 1924411240174876881L);
        setLongField(term10749, term10749.getClass(), "compressedSize", -8287954071414913487L);
        Object term10767 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10767, term10767.getClass(), "name", "");
        setBooleanField(term10767, term10767.getClass(), "hasStream", true);
        setBooleanField(term10767, term10767.getClass(), "isDirectory", true);
        setBooleanField(term10767, term10767.getClass(), "isAntiItem", false);
        setBooleanField(term10767, term10767.getClass(), "hasCreationDate", true);
        setBooleanField(term10767, term10767.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term10767, term10767.getClass(), "hasAccessDate", true);
        setLongField(term10767, term10767.getClass(), "creationDate", -1379663556617181551L);
        setLongField(term10767, term10767.getClass(), "lastModifiedDate", -927624000067769617L);
        setLongField(term10767, term10767.getClass(), "accessDate", 2978561187278004830L);
        setBooleanField(term10767, term10767.getClass(), "hasWindowsAttributes", false);
        setIntField(term10767, term10767.getClass(), "windowsAttributes", -1970452551);
        setBooleanField(term10767, term10767.getClass(), "hasCrc", false);
        setLongField(term10767, term10767.getClass(), "crc", 4903104596895674146L);
        setLongField(term10767, term10767.getClass(), "compressedCrc", 3410093279424884335L);
        setLongField(term10767, term10767.getClass(), "size", -8848853088235282046L);
        setLongField(term10767, term10767.getClass(), "compressedSize", 5646422912118770408L);
        Object term10785 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10785, term10785.getClass(), "name", "");
        setBooleanField(term10785, term10785.getClass(), "hasStream", true);
        setBooleanField(term10785, term10785.getClass(), "isDirectory", true);
        setBooleanField(term10785, term10785.getClass(), "isAntiItem", false);
        setBooleanField(term10785, term10785.getClass(), "hasCreationDate", false);
        setBooleanField(term10785, term10785.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term10785, term10785.getClass(), "hasAccessDate", false);
        setLongField(term10785, term10785.getClass(), "creationDate", 1370021222113276207L);
        setLongField(term10785, term10785.getClass(), "lastModifiedDate", 2671083699707412572L);
        setLongField(term10785, term10785.getClass(), "accessDate", 8940743873279878610L);
        setBooleanField(term10785, term10785.getClass(), "hasWindowsAttributes", false);
        setIntField(term10785, term10785.getClass(), "windowsAttributes", -1896376975);
        setBooleanField(term10785, term10785.getClass(), "hasCrc", false);
        setLongField(term10785, term10785.getClass(), "crc", -1865007698397606253L);
        setLongField(term10785, term10785.getClass(), "compressedCrc", 2355652609935652353L);
        setLongField(term10785, term10785.getClass(), "size", 7393438062788805516L);
        setLongField(term10785, term10785.getClass(), "compressedSize", 5383032785479262184L);
        Object term10803 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10803, term10803.getClass(), "name", "");
        setBooleanField(term10803, term10803.getClass(), "hasStream", false);
        setBooleanField(term10803, term10803.getClass(), "isDirectory", true);
        setBooleanField(term10803, term10803.getClass(), "isAntiItem", true);
        setBooleanField(term10803, term10803.getClass(), "hasCreationDate", false);
        setBooleanField(term10803, term10803.getClass(), "hasLastModifiedDate", true);
        setBooleanField(term10803, term10803.getClass(), "hasAccessDate", false);
        setLongField(term10803, term10803.getClass(), "creationDate", -6900715686580158779L);
        setLongField(term10803, term10803.getClass(), "lastModifiedDate", -7755863896540616668L);
        setLongField(term10803, term10803.getClass(), "accessDate", 6762397834421232825L);
        setBooleanField(term10803, term10803.getClass(), "hasWindowsAttributes", false);
        setIntField(term10803, term10803.getClass(), "windowsAttributes", 729658803);
        setBooleanField(term10803, term10803.getClass(), "hasCrc", false);
        setLongField(term10803, term10803.getClass(), "crc", -5414076154478910734L);
        setLongField(term10803, term10803.getClass(), "compressedCrc", -2922851649897789783L);
        setLongField(term10803, term10803.getClass(), "size", 5023047512459111304L);
        setLongField(term10803, term10803.getClass(), "compressedSize", 7269420277013840543L);
        Object term10821 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry"));
        setField(term10821, term10821.getClass(), "name", "");
        setBooleanField(term10821, term10821.getClass(), "hasStream", true);
        setBooleanField(term10821, term10821.getClass(), "isDirectory", false);
        setBooleanField(term10821, term10821.getClass(), "isAntiItem", false);
        setBooleanField(term10821, term10821.getClass(), "hasCreationDate", false);
        setBooleanField(term10821, term10821.getClass(), "hasLastModifiedDate", false);
        setBooleanField(term10821, term10821.getClass(), "hasAccessDate", false);
        setLongField(term10821, term10821.getClass(), "creationDate", -6903160242975707710L);
        setLongField(term10821, term10821.getClass(), "lastModifiedDate", 5305896099727663023L);
        setLongField(term10821, term10821.getClass(), "accessDate", 6151197215723513345L);
        setBooleanField(term10821, term10821.getClass(), "hasWindowsAttributes", false);
        setIntField(term10821, term10821.getClass(), "windowsAttributes", 114754804);
        setBooleanField(term10821, term10821.getClass(), "hasCrc", true);
        setLongField(term10821, term10821.getClass(), "crc", 2923644849350978175L);
        setLongField(term10821, term10821.getClass(), "compressedCrc", -575923088526116016L);
        setLongField(term10821, term10821.getClass(), "size", 8912657350087595530L);
        setLongField(term10821, term10821.getClass(), "compressedSize", 7440648013789140935L);
        ArrayList term10693 = new ArrayList();
        ((ArrayList) term10693).add(term10695);
        ((ArrayList) term10693).add(term10713);
        ((ArrayList) term10693).add(term10731);
        ((ArrayList) term10693).add(term10749);
        ((ArrayList) term10693).add(term10767);
        ((ArrayList) term10693).add(term10785);
        ((ArrayList) term10693).add(term10803);
        ((ArrayList) term10693).add(term10821);
        Class<? extends Object> term34062 = Class.forName((String) "org.apache.commons.compress.archivers.sevenz.SevenZMethod");
        Field term34061 = ((Class) term34062).getDeclaredField((String) "BZIP2");
        ((Field) term34061).setAccessible(true);
        Object enum67 = ((Field) term34061).get((Object) null);
        term10667 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile"));
        Object term10668 = newInstance(Class.forName("java.io.RandomAccessFile"));
        Object term10669 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term10691 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicBoolean"));
        Object term10842 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term10844 = newInstance(Class.forName("java.util.zip.CRC32"));
        Object term10848 = newInstance(Class.forName("org.apache.commons.compress.utils.CountingOutputStream"));
        Object term10851 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term10669, term10669.getClass(), "fd", -1);
        setLongField(term10669, term10669.getClass(), "handle", -1L);
        setField(term10669, term10669.getClass(), "parent", null);
        setField(term10669, term10669.getClass(), "otherParents", term10672);
        setBooleanField(term10669, term10669.getClass(), "closed", false);
        setBooleanField(term10669, term10669.getClass(), "append", true);
        setField(term10669, term10669.getClass(), "cleanup", null);
        setField(term10668, term10668.getClass(), "fd", term10669);
        setField(term10668, term10668.getClass(), "channel", null);
        setBooleanField(term10668, term10668.getClass(), "rw", true);
        setField(term10668, term10668.getClass(), "path", "RYdKCNNMBR");
        setIntField(term10691, term10691.getClass(), "value", -1504890659);
        setField(term10668, term10668.getClass(), "closed", term10691);
        setField(term10667, term10667.getClass(), "file", term10668);
        setField(term10667, term10667.getClass(), "files", term10693);
        setIntField(term10667, term10667.getClass(), "numNonEmptyStreams", 1687361082);
        setIntField(term10842, term10842.getClass(), "crc", 584893196);
        setField(term10667, term10667.getClass(), "crc32", term10842);
        setIntField(term10844, term10844.getClass(), "crc", 497269071);
        setField(term10667, term10667.getClass(), "compressedCrc32", term10844);
        setLongField(term10667, term10667.getClass(), "fileBytesWritten", -7488291606536854368L);
        setBooleanField(term10667, term10667.getClass(), "finished", false);
        setLongField(term10848, term10848.getClass(), "bytesWritten", -6664891356964396236L);
        setField(term10848, term10848.getClass(), "out", null);
        setBooleanField(term10848, term10848.getClass(), "closed", true);
        setField(term10848, term10848.getClass(), "closeLock", term10851);
        setField(term10667, term10667.getClass(), "currentOutputStream", term10848);
        setField(term10667, term10667.getClass(), "contentCompression", enum67);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.SevenZOutputFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataOutput");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "writeFileCTimes", argTypes, term10667, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


