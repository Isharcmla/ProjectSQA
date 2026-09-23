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

public class TarArchiveInputStream_init_1776664775162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68757;

    public TarArchiveInputStream_init_1776664775162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term68577 = new HashMap();
        Object term68529 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term68096 = (byte[]) newByteArray(0);
        byte[] term68355 = (byte[]) newByteArray(0);
        Object term68629 = newInstance(Class.forName("java.io.FileInputStream"));
        setField(term68529, term68529.getClass(), "SINGLE", term68096);
        setLongField(term68529, term68529.getClass(), "bytesRead", 0L);
        setField(term68529, term68529.getClass(), "SMALL_BUF", term68355);
        setField(term68529, term68529.getClass(), "globalPaxHeaders", term68577);
        setField(term68529, term68529.getClass(), "is", term68629);
        setBooleanField(term68529, term68529.getClass(), "hasHitEOF", false);
        setField(term68529, term68529.getClass(), "encoding", null);
        term68757 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term68757;
        args[1] = 0;
        args[2] = 0;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


