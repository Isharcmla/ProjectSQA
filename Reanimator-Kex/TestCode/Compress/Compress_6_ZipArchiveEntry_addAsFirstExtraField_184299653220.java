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

public class ZipArchiveEntry_addAsFirstExtraField_184299653220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11628;

    public ZipArchiveEntry_addAsFirstExtraField_184299653220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term11633 = new LinkedHashMap();
        Class<? extends Object> term11781 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11780 = ((Class) term11781).getDeclaredField((String) "MICROSECONDS");
        ((Field) term11780).setAccessible(true);
        Object enum46 = ((Field) term11780).get((Object) null);
        Class<? extends Object> term11989 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term11988 = ((Class) term11989).getDeclaredField((String) "MILLISECONDS");
        ((Field) term11988).setAccessible(true);
        Object enum47 = ((Field) term11988).get((Object) null);
        term11628 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term11654 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11680 = newInstance(Class.forName("java.time.Instant"));
        Object term11695 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11697 = newInstance(Class.forName("java.time.Instant"));
        Object term11712 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term11738 = newInstance(Class.forName("java.time.Instant"));
        byte[] term11758 = (byte[]) newByteArray(8);
        setIntField(term11628, term11628.getClass(), "method", -1);
        setIntField(term11628, term11628.getClass(), "internalAttributes", 1114000454);
        setIntField(term11628, term11628.getClass(), "platform", -556405712);
        setLongField(term11628, term11628.getClass(), "externalAttributes", 305759998609888272L);
        setField(term11628, term11628.getClass(), "extraFields", term11633);
        setField(term11628, term11628.getClass(), "name", "");
        setLongField(term11628, term11628.getClass(), "xdostime", -1L);
        setField(term11654, term11654.getClass(), "unit", enum46);
        setLongField(term11654, term11654.getClass(), "value", -8654565919063661957L);
        setLongField(term11680, term11680.getClass(), "seconds", 1362798563L);
        setIntField(term11680, term11680.getClass(), "nanos", 394000000);
        setField(term11654, term11654.getClass(), "instant", term11680);
        setField(term11654, term11654.getClass(), "valueAsString", "jSpAteRute");
        setField(term11628, term11628.getClass(), "mtime", term11654);
        setField(term11695, term11695.getClass(), "unit", enum46);
        setLongField(term11695, term11695.getClass(), "value", -5248475803419977214L);
        setLongField(term11697, term11697.getClass(), "seconds", 1853981979L);
        setIntField(term11697, term11697.getClass(), "nanos", 281000000);
        setField(term11695, term11695.getClass(), "instant", term11697);
        setField(term11695, term11695.getClass(), "valueAsString", "swZVeJAxjt");
        setField(term11628, term11628.getClass(), "atime", term11695);
        setField(term11712, term11712.getClass(), "unit", enum47);
        setLongField(term11712, term11712.getClass(), "value", -6723783499250797216L);
        setLongField(term11738, term11738.getClass(), "seconds", 1795954337L);
        setIntField(term11738, term11738.getClass(), "nanos", 628000000);
        setField(term11712, term11712.getClass(), "instant", term11738);
        setField(term11712, term11712.getClass(), "valueAsString", "xOcJIiQQDu");
        setField(term11628, term11628.getClass(), "ctime", term11712);
        setLongField(term11628, term11628.getClass(), "crc", -1L);
        setLongField(term11628, term11628.getClass(), "size", -1L);
        setLongField(term11628, term11628.getClass(), "csize", -1L);
        setIntField(term11628, term11628.getClass(), "flag", -1772434990);
        setByteElement(term11758, 0, (byte) 102);
        setByteElement(term11758, 1, (byte) -118);
        setByteElement(term11758, 2, (byte) -126);
        setByteElement(term11758, 3, (byte) -91);
        setByteElement(term11758, 4, (byte) -104);
        setByteElement(term11758, 5, (byte) -89);
        setByteElement(term11758, 6, (byte) 13);
        setByteElement(term11758, 7, (byte) 44);
        setField(term11628, term11628.getClass(), "extra", term11758);
        setField(term11628, term11628.getClass(), "comment", "GVizqqzXpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipExtraField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addAsFirstExtraField", argTypes, term11628, args);
    }

};


