package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class TarArchiveInputStream_init_927929389150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63806;

    public TarArchiveInputStream_init_927929389150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term63612 = new HashMap();
        Object term63564 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term63131 = (byte[]) newByteArray(0);
        byte[] term63390 = (byte[]) newByteArray(0);
        Object term63674 = newInstance(Class.forName("org.tukaani.xz.XZInputStream"));
        setField(term63564, term63564.getClass(), "SINGLE", term63131);
        setLongField(term63564, term63564.getClass(), "bytesRead", 0L);
        setField(term63564, term63564.getClass(), "SMALL_BUF", term63390);
        setField(term63564, term63564.getClass(), "globalPaxHeaders", term63612);
        setField(term63564, term63564.getClass(), "is", term63674);
        setBooleanField(term63564, term63564.getClass(), "hasHitEOF", false);
        setField(term63564, term63564.getClass(), "encoding", null);
        term63806 = newInstance(Class.forName("org.apache.commons.compress.archivers.arj.ArjArchiveInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term63806;
        args[1] = 0;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


