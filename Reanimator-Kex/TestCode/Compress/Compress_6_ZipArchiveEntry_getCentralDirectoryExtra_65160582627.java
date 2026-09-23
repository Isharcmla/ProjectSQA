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

public class ZipArchiveEntry_getCentralDirectoryExtra_65160582627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16252;

    public ZipArchiveEntry_getCentralDirectoryExtra_65160582627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term16257 = new LinkedHashMap();
        Class<? extends Object> term16376 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term16375 = ((Class) term16376).getDeclaredField((String) "MILLISECONDS");
        ((Field) term16375).setAccessible(true);
        Object enum64 = ((Field) term16375).get((Object) null);
        term16252 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term16278 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16304 = newInstance(Class.forName("java.time.Instant"));
        Object term16319 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16321 = newInstance(Class.forName("java.time.Instant"));
        Object term16336 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term16338 = newInstance(Class.forName("java.time.Instant"));
        byte[] term16358 = (byte[]) newByteArray(3);
        setIntField(term16252, term16252.getClass(), "method", -1);
        setIntField(term16252, term16252.getClass(), "internalAttributes", 53410913);
        setIntField(term16252, term16252.getClass(), "platform", -375014958);
        setLongField(term16252, term16252.getClass(), "externalAttributes", 2135754395358000892L);
        setField(term16252, term16252.getClass(), "extraFields", term16257);
        setField(term16252, term16252.getClass(), "name", "");
        setLongField(term16252, term16252.getClass(), "xdostime", -1L);
        setField(term16278, term16278.getClass(), "unit", enum64);
        setLongField(term16278, term16278.getClass(), "value", -8085190702504231560L);
        setLongField(term16304, term16304.getClass(), "seconds", 1263762156L);
        setIntField(term16304, term16304.getClass(), "nanos", 294000000);
        setField(term16278, term16278.getClass(), "instant", term16304);
        setField(term16278, term16278.getClass(), "valueAsString", "AdxvLJhNLe");
        setField(term16252, term16252.getClass(), "mtime", term16278);
        setField(term16319, term16319.getClass(), "unit", enum64);
        setLongField(term16319, term16319.getClass(), "value", 1672578078364590450L);
        setLongField(term16321, term16321.getClass(), "seconds", 1490974290L);
        setIntField(term16321, term16321.getClass(), "nanos", 70000000);
        setField(term16319, term16319.getClass(), "instant", term16321);
        setField(term16319, term16319.getClass(), "valueAsString", "lHfTrWKMPk");
        setField(term16252, term16252.getClass(), "atime", term16319);
        setField(term16336, term16336.getClass(), "unit", enum64);
        setLongField(term16336, term16336.getClass(), "value", 4949335493504695457L);
        setLongField(term16338, term16338.getClass(), "seconds", 1285679498L);
        setIntField(term16338, term16338.getClass(), "nanos", 273000000);
        setField(term16336, term16336.getClass(), "instant", term16338);
        setField(term16336, term16336.getClass(), "valueAsString", "JDaAnsVTGV");
        setField(term16252, term16252.getClass(), "ctime", term16336);
        setLongField(term16252, term16252.getClass(), "crc", -1L);
        setLongField(term16252, term16252.getClass(), "size", -1L);
        setLongField(term16252, term16252.getClass(), "csize", -1L);
        setIntField(term16252, term16252.getClass(), "flag", 1107176718);
        setByteElement(term16358, 0, (byte) -102);
        setByteElement(term16358, 1, (byte) -95);
        setByteElement(term16358, 2, (byte) -2);
        setField(term16252, term16252.getClass(), "extra", term16358);
        setField(term16252, term16252.getClass(), "comment", "mLUZFTfjle");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCentralDirectoryExtra", argTypes, term16252, args);
    }

};


