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
import java.util.HashMap;
import java.lang.Object;

public class ZipFile_resolveLocalFileHeaderData_8373882454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18046;

    public ZipFile_resolveLocalFileHeaderData_8373882454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18184 = newInstance(Class.forName("java.lang.Object"));
        Object term18222 = newInstance(Class.forName("java.lang.Object"));
        HashMap term18094 = new HashMap();
        ((HashMap) term18094).put(term18184, term18184);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        ((HashMap) term18094).put(term18222, term18222);
        term18046 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile"));
        setField(term18046, term18046.getClass(), "entries", term18094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.ZipFile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "resolveLocalFileHeaderData", argTypes, term18046, args);
    }

};


