package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.String;
import java.lang.Integer;

public class ZipArchiveInputStream_read_58095739216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;
     Object term1734;
     Object term1737;
     Object term1739;

    public ZipArchiveInputStream_read_58095739216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1611 = new LinkedHashMap();
        Class<? extends Object> term12916 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term12915 = ((Class) term12916).getDeclaredField((String) "DAYS");
        ((Field) term12915).setAccessible(true);
        Object enum30 = ((Field) term12915).get((Object) null);
        Class<? extends Object> term13100 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term13099 = ((Class) term13100).getDeclaredField((String) "MILLISECONDS");
        ((Field) term13099).setAccessible(true);
        Object enum31 = ((Field) term13099).get((Object) null);
        term1567 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream"));
        Object term1569 = newInstance(Class.forName("java.util.zip.Inflater"));
        Object term1570 = newInstance(Class.forName("java.util.zip.Inflater$InflaterZStreamRef"));
        Object term1572 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1573 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1574 = newInstance(Class.forName("jdk.internal.ref.CleanerImpl$PhantomCleanableRef"));
        Object term1575 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1577 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term1578 = (byte[]) newByteArray(0);
        byte[] term1588 = (byte[]) newByteArray(7);
        Object term1604 = newInstance(Class.forName("java.util.zip.CRC32"));
        byte[] term1606 = (byte[]) newByteArray(0);
        Object term1607 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term1632 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1645 = newInstance(Class.forName("java.time.Instant"));
        Object term1660 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1662 = newInstance(Class.forName("java.time.Instant"));
        Object term1677 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term1690 = newInstance(Class.forName("java.time.Instant"));
        byte[] term1710 = (byte[]) newByteArray(1);
        byte[] term1732 = (byte[]) newByteArray(0);
        setField(term1567, term1567.getClass(), "zipEncoding", null);
        setBooleanField(term1567, term1567.getClass(), "useUnicodeExtraFields", true);
        setField(term1567, term1567.getClass(), "in", null);
        setLongField(term1570, term1570.getClass(), "address", 132947026206176L);
        setField(term1572, term1572.getClass(), "action", term1570);
        setField(term1573, term1573.getClass(), "action", null);
        setField(term1573, term1573.getClass(), "prev", null);
        setField(term1573, term1573.getClass(), "next", term1572);
        setField(term1573, term1573.getClass(), "list", term1573);
        setField(term1573, term1573.getClass(), "referent", null);
        setField(term1573, term1573.getClass(), "queue", null);
        setField(term1573, term1573.getClass(), "next", null);
        setField(term1573, term1573.getClass(), "discovered", null);
        setField(term1572, term1572.getClass(), "prev", term1573);
        setField(term1574, term1574.getClass(), "action", null);
        setField(term1574, term1574.getClass(), "prev", term1572);
        setField(term1574, term1574.getClass(), "next", null);
        setField(term1574, term1574.getClass(), "list", term1573);
        setField(term1574, term1574.getClass(), "referent", null);
        setField(term1574, term1574.getClass(), "queue", null);
        setField(term1574, term1574.getClass(), "next", null);
        setField(term1574, term1574.getClass(), "discovered", null);
        setField(term1572, term1572.getClass(), "next", term1574);
        setField(term1572, term1572.getClass(), "list", term1573);
        setField(term1572, term1572.getClass(), "referent", term1569);
        setField(term1575, term1575.getClass(), "lock", null);
        setField(term1575, term1575.getClass(), "head", null);
        setLongField(term1575, term1575.getClass(), "queueLength", 0L);
        setField(term1572, term1572.getClass(), "queue", term1575);
        setField(term1572, term1572.getClass(), "next", null);
        setField(term1572, term1572.getClass(), "discovered", null);
        setField(term1570, term1570.getClass(), "cleanable", term1572);
        setField(term1569, term1569.getClass(), "zsRef", term1570);
        setField(term1577, term1577.getClass(), "hb", term1578);
        setIntField(term1577, term1577.getClass(), "offset", 0);
        setBooleanField(term1577, term1577.getClass(), "isReadOnly", false);
        setBooleanField(term1577, term1577.getClass(), "bigEndian", true);
        setBooleanField(term1577, term1577.getClass(), "nativeByteOrder", false);
        setIntField(term1577, term1577.getClass(), "mark", -1);
        setIntField(term1577, term1577.getClass(), "position", 0);
        setIntField(term1577, term1577.getClass(), "limit", 0);
        setIntField(term1577, term1577.getClass(), "capacity", 0);
        setLongField(term1577, term1577.getClass(), "address", 16L);
        setField(term1569, term1569.getClass(), "input", term1577);
        setByteElement(term1588, 0, (byte) -61);
        setByteElement(term1588, 1, (byte) -85);
        setByteElement(term1588, 2, (byte) -22);
        setByteElement(term1588, 3, (byte) 93);
        setByteElement(term1588, 4, (byte) 69);
        setByteElement(term1588, 5, (byte) -74);
        setByteElement(term1588, 6, (byte) -123);
        setField(term1569, term1569.getClass(), "inputArray", term1588);
        setIntField(term1569, term1569.getClass(), "inputPos", -203030934);
        setIntField(term1569, term1569.getClass(), "inputLim", -1179120542);
        setBooleanField(term1569, term1569.getClass(), "finished", false);
        setBooleanField(term1569, term1569.getClass(), "needDict", false);
        setLongField(term1569, term1569.getClass(), "bytesRead", -4325723315152823407L);
        setLongField(term1569, term1569.getClass(), "bytesWritten", 2535595959091595249L);
        setIntField(term1569, term1569.getClass(), "inputConsumed", -73683645);
        setIntField(term1569, term1569.getClass(), "outputConsumed", -226514366);
        setField(term1567, term1567.getClass(), "inf", term1569);
        setIntField(term1604, term1604.getClass(), "crc", 1193880199);
        setField(term1567, term1567.getClass(), "crc", term1604);
        setField(term1567, term1567.getClass(), "buf", term1606);
        setIntField(term1607, term1607.getClass(), "internalAttributes", -1530420153);
        setIntField(term1607, term1607.getClass(), "platform", -469968304);
        setLongField(term1607, term1607.getClass(), "externalAttributes", -5476826692763582090L);
        setField(term1607, term1607.getClass(), "extraFields", term1611);
        setField(term1607, term1607.getClass(), "name", "");
        setLongField(term1607, term1607.getClass(), "xdostime", -1L);
        setField(term1632, term1632.getClass(), "unit", enum30);
        setLongField(term1632, term1632.getClass(), "value", -872011222785455006L);
        setLongField(term1645, term1645.getClass(), "seconds", 1429041851L);
        setIntField(term1645, term1645.getClass(), "nanos", 389000000);
        setField(term1632, term1632.getClass(), "instant", term1645);
        setField(term1632, term1632.getClass(), "valueAsString", "MxlszYVzRf");
        setField(term1607, term1607.getClass(), "mtime", term1632);
        setField(term1660, term1660.getClass(), "unit", enum30);
        setLongField(term1660, term1660.getClass(), "value", -316468845751588286L);
        setLongField(term1662, term1662.getClass(), "seconds", 1495375463L);
        setIntField(term1662, term1662.getClass(), "nanos", 288000000);
        setField(term1660, term1660.getClass(), "instant", term1662);
        setField(term1660, term1660.getClass(), "valueAsString", "LQFpaHEwXR");
        setField(term1607, term1607.getClass(), "atime", term1660);
        setField(term1677, term1677.getClass(), "unit", enum31);
        setLongField(term1677, term1677.getClass(), "value", 5127676408959197577L);
        setLongField(term1690, term1690.getClass(), "seconds", 1645852034L);
        setIntField(term1690, term1690.getClass(), "nanos", 896000000);
        setField(term1677, term1677.getClass(), "instant", term1690);
        setField(term1677, term1677.getClass(), "valueAsString", "oVcInYnLWB");
        setField(term1607, term1607.getClass(), "ctime", term1677);
        setLongField(term1607, term1607.getClass(), "crc", -1L);
        setLongField(term1607, term1607.getClass(), "size", -1L);
        setLongField(term1607, term1607.getClass(), "csize", -1L);
        setIntField(term1607, term1607.getClass(), "method", -1);
        setIntField(term1607, term1607.getClass(), "flag", -1145578966);
        setByteElement(term1710, 0, (byte) -23);
        setField(term1607, term1607.getClass(), "extra", term1710);
        setField(term1607, term1607.getClass(), "comment", "aJlieCFVtF");
        setField(term1567, term1567.getClass(), "current", term1607);
        setBooleanField(term1567, term1567.getClass(), "closed", true);
        setBooleanField(term1567, term1567.getClass(), "hitCentralDirectory", true);
        setIntField(term1567, term1567.getClass(), "readBytesOfEntry", 1962444399);
        setIntField(term1567, term1567.getClass(), "offsetInBuffer", 767834723);
        setIntField(term1567, term1567.getClass(), "bytesReadFromStream", -602026508);
        setIntField(term1567, term1567.getClass(), "lengthOfLastRead", -157887805);
        setBooleanField(term1567, term1567.getClass(), "hasDataDescriptor", false);
        setField(term1567, term1567.getClass(), "SINGLE", term1732);
        setIntField(term1567, term1567.getClass(), "bytesRead", 1876565163);
        term1734 = (byte[]) newByteArray(2);
        setByteElement(term1734, 0, (byte) 100);
        setByteElement(term1734, 1, (byte) 106);
        term1737 = new Integer(-817164822);
        term1739 = new Integer(-1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1734;
        args[1] = term1737;
        args[2] = term1739;
        try {
            callMethod(klass, "read", argTypes, term1567, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


