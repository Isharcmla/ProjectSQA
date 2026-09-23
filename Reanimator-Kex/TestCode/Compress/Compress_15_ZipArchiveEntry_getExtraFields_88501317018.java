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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ZipArchiveEntry_getExtraFields_88501317018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10608;
     Object term10797;

    public ZipArchiveEntry_getExtraFields_88501317018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term10614 = new LinkedHashMap();
        Class<? extends Object> term10822 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term10821 = ((Class) term10822).getDeclaredField((String) "SECONDS");
        ((Field) term10821).setAccessible(true);
        Object enum40 = ((Field) term10821).get((Object) null);
        Class<? extends Object> term11005 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11004 = ((Class) term11005).getDeclaredField((String) "MILLISECONDS");
        ((Field) term11004).setAccessible(true);
        Object enum41 = ((Field) term11004).get((Object) null);
        Class<? extends Object> term11203 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11202 = ((Class) term11203).getDeclaredField((String) "DAYS");
        ((Field) term11202).setAccessible(true);
        Object enum42 = ((Field) term11202).get((Object) null);
        term10608 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term10625 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData"));
        byte[] term10626 = (byte[]) newByteArray(9);
        byte[] term10636 = (byte[]) newByteArray(7);
        byte[] term10646 = (byte[]) newByteArray(6);
        Object term10653 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.GeneralPurposeBit"));
        Object term10661 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10682 = newInstance(Class.forName("java.time.Instant"));
        Object term10697 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10723 = newInstance(Class.forName("java.time.Instant"));
        Object term10738 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term10756 = newInstance(Class.forName("java.time.Instant"));
        byte[] term10776 = (byte[]) newByteArray(7);
        setIntField(term10608, term10608.getClass(), "method", -1);
        setLongField(term10608, term10608.getClass(), "size", -1L);
        setIntField(term10608, term10608.getClass(), "internalAttributes", -505439934);
        setIntField(term10608, term10608.getClass(), "platform", -344842608);
        setLongField(term10608, term10608.getClass(), "externalAttributes", 5953383087795962419L);
        setField(term10608, term10608.getClass(), "extraFields", term10614);
        setByteElement(term10626, 0, (byte) 115);
        setByteElement(term10626, 1, (byte) -32);
        setByteElement(term10626, 2, (byte) -52);
        setByteElement(term10626, 3, (byte) 53);
        setByteElement(term10626, 4, (byte) 44);
        setByteElement(term10626, 5, (byte) 49);
        setByteElement(term10626, 6, (byte) 114);
        setByteElement(term10626, 7, (byte) -81);
        setByteElement(term10626, 8, (byte) 127);
        setField(term10625, term10625.getClass(), "localFileData", term10626);
        setByteElement(term10636, 0, (byte) -24);
        setByteElement(term10636, 1, (byte) -89);
        setByteElement(term10636, 2, (byte) -35);
        setByteElement(term10636, 3, (byte) -59);
        setByteElement(term10636, 4, (byte) 73);
        setByteElement(term10636, 5, (byte) 94);
        setByteElement(term10636, 6, (byte) 114);
        setField(term10625, term10625.getClass(), "centralDirectoryData", term10636);
        setField(term10608, term10608.getClass(), "unparseableExtra", term10625);
        setField(term10608, term10608.getClass(), "name", "");
        setByteElement(term10646, 0, (byte) 110);
        setByteElement(term10646, 1, (byte) 70);
        setByteElement(term10646, 2, (byte) -46);
        setByteElement(term10646, 3, (byte) -78);
        setByteElement(term10646, 4, (byte) 109);
        setByteElement(term10646, 5, (byte) 17);
        setField(term10608, term10608.getClass(), "rawName", term10646);
        setBooleanField(term10653, term10653.getClass(), "languageEncodingFlag", false);
        setBooleanField(term10653, term10653.getClass(), "dataDescriptorFlag", false);
        setBooleanField(term10653, term10653.getClass(), "encryptionFlag", false);
        setBooleanField(term10653, term10653.getClass(), "strongEncryptionFlag", false);
        setField(term10608, term10608.getClass(), "gpb", term10653);
        setLongField(term10608, term10608.getClass(), "xdostime", -1L);
        setField(term10661, term10661.getClass(), "unit", enum40);
        setLongField(term10661, term10661.getClass(), "value", 7994303628307559416L);
        setLongField(term10682, term10682.getClass(), "seconds", 1633022775L);
        setIntField(term10682, term10682.getClass(), "nanos", 487000000);
        setField(term10661, term10661.getClass(), "instant", term10682);
        setField(term10661, term10661.getClass(), "valueAsString", "fhkbdRViHi");
        setField(term10608, term10608.getClass(), "mtime", term10661);
        setField(term10697, term10697.getClass(), "unit", enum41);
        setLongField(term10697, term10697.getClass(), "value", 2443640364875054177L);
        setLongField(term10723, term10723.getClass(), "seconds", 1819209638L);
        setIntField(term10723, term10723.getClass(), "nanos", 549000000);
        setField(term10697, term10697.getClass(), "instant", term10723);
        setField(term10697, term10697.getClass(), "valueAsString", "uWHnvSvaPl");
        setField(term10608, term10608.getClass(), "atime", term10697);
        setField(term10738, term10738.getClass(), "unit", enum42);
        setLongField(term10738, term10738.getClass(), "value", -1610676979013636850L);
        setLongField(term10756, term10756.getClass(), "seconds", 1400709778L);
        setIntField(term10756, term10756.getClass(), "nanos", 698000000);
        setField(term10738, term10738.getClass(), "instant", term10756);
        setField(term10738, term10738.getClass(), "valueAsString", "kBdSllIBVz");
        setField(term10608, term10608.getClass(), "ctime", term10738);
        setLongField(term10608, term10608.getClass(), "crc", -1L);
        setLongField(term10608, term10608.getClass(), "csize", -1L);
        setIntField(term10608, term10608.getClass(), "flag", 444029505);
        setByteElement(term10776, 0, (byte) -126);
        setByteElement(term10776, 1, (byte) 35);
        setByteElement(term10776, 2, (byte) -46);
        setByteElement(term10776, 3, (byte) -14);
        setByteElement(term10776, 4, (byte) 124);
        setByteElement(term10776, 5, (byte) -124);
        setByteElement(term10776, 6, (byte) -72);
        setField(term10608, term10608.getClass(), "extra", term10776);
        setField(term10608, term10608.getClass(), "comment", "TJmVBGfTML");
        term10797 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10797;
        callMethod(klass, "getExtraFields", argTypes, term10608, args);
    }

};


