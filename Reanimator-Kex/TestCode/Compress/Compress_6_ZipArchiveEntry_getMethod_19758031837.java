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

public class ZipArchiveEntry_getMethod_19758031837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2721;

    public ZipArchiveEntry_getMethod_19758031837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term2726 = new LinkedHashMap();
        Class<? extends Object> term2879 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term2878 = ((Class) term2879).getDeclaredField((String) "MICROSECONDS");
        ((Field) term2878).setAccessible(true);
        Object enum10 = ((Field) term2878).get((Object) null);
        Class<? extends Object> term3077 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3076 = ((Class) term3077).getDeclaredField((String) "MINUTES");
        ((Field) term3076).setAccessible(true);
        Object enum11 = ((Field) term3076).get((Object) null);
        Class<? extends Object> term3260 = Class.forName((String) "java.util.concurrent.TimeUnit");
        Field term3259 = ((Class) term3260).getDeclaredField((String) "HOURS");
        ((Field) term3259).setAccessible(true);
        Object enum12 = ((Field) term3259).get((Object) null);
        term2721 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry"));
        Object term2747 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2773 = newInstance(Class.forName("java.time.Instant"));
        Object term2788 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2809 = newInstance(Class.forName("java.time.Instant"));
        Object term2824 = newInstance(Class.forName("java.nio.file.attribute.FileTime"));
        Object term2843 = newInstance(Class.forName("java.time.Instant"));
        byte[] term2863 = (byte[]) newByteArray(1);
        setIntField(term2721, term2721.getClass(), "method", -1);
        setIntField(term2721, term2721.getClass(), "internalAttributes", 1048535127);
        setIntField(term2721, term2721.getClass(), "platform", -655067527);
        setLongField(term2721, term2721.getClass(), "externalAttributes", -872011222785455006L);
        setField(term2721, term2721.getClass(), "extraFields", term2726);
        setField(term2721, term2721.getClass(), "name", "");
        setLongField(term2721, term2721.getClass(), "xdostime", -1L);
        setField(term2747, term2747.getClass(), "unit", enum10);
        setLongField(term2747, term2747.getClass(), "value", -316468845751588286L);
        setLongField(term2773, term2773.getClass(), "seconds", 1745480962L);
        setIntField(term2773, term2773.getClass(), "nanos", 80000000);
        setField(term2747, term2747.getClass(), "instant", term2773);
        setField(term2747, term2747.getClass(), "valueAsString", "BYqFIqCKAV");
        setField(term2721, term2721.getClass(), "mtime", term2747);
        setField(term2788, term2788.getClass(), "unit", enum11);
        setLongField(term2788, term2788.getClass(), "value", 5127676408959197577L);
        setLongField(term2809, term2809.getClass(), "seconds", 1349087753L);
        setIntField(term2809, term2809.getClass(), "nanos", 960000000);
        setField(term2788, term2788.getClass(), "instant", term2809);
        setField(term2788, term2788.getClass(), "valueAsString", "vrQLuWIDJX");
        setField(term2721, term2721.getClass(), "atime", term2788);
        setField(term2824, term2824.getClass(), "unit", enum12);
        setLongField(term2824, term2824.getClass(), "value", -6573104506744284592L);
        setLongField(term2843, term2843.getClass(), "seconds", 1706096172L);
        setIntField(term2843, term2843.getClass(), "nanos", 457000000);
        setField(term2824, term2824.getClass(), "instant", term2843);
        setField(term2824, term2824.getClass(), "valueAsString", "flxyYxBRtu");
        setField(term2721, term2721.getClass(), "ctime", term2824);
        setLongField(term2721, term2721.getClass(), "crc", -1L);
        setLongField(term2721, term2721.getClass(), "size", -1L);
        setLongField(term2721, term2721.getClass(), "csize", -1L);
        setIntField(term2721, term2721.getClass(), "flag", -6029667);
        setByteElement(term2863, 0, (byte) -54);
        setField(term2721, term2721.getClass(), "extra", term2863);
        setField(term2721, term2721.getClass(), "comment", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term2721, args);
    }

};


