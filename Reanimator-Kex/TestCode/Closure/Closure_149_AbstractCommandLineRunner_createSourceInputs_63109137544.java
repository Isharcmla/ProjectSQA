package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.LinkedList;
import java.util.ArrayList;
import java.lang.Object;

public class AbstractCommandLineRunner_createSourceInputs_63109137544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9259;
     Object term46139;
     Object term46048;

    public AbstractCommandLineRunner_createSourceInputs_63109137544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9259 = new LinkedList();
        ((LinkedList) term9259).add("fhkbdRViHi");
        ((LinkedList) term9259).add("uWHnvSvaPl");
        ((LinkedList) term9259).add("");
        term46139 = new LinkedList();
        ((LinkedList) term46139).add("fhkbdRViHi");
        ((LinkedList) term46139).add("uWHnvSvaPl");
        ((LinkedList) term46139).add("");
        Object term46050 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term46051 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        Object term46052 = newInstance(Class.forName("java.io.File"));
        setField(term46052, term46052.getClass(), "path", null);
        setField(term46052, term46052.getClass(), "status", null);
        setIntField(term46052, term46052.getClass(), "prefixLength", 0);
        setField(term46052, term46052.getClass(), "filePath", null);
        setField(term46051, term46051.getClass(), "file", term46052);
        setField(term46051, term46051.getClass(), "inputCharset", "");
        setField(term46051, term46051.getClass(), "fileName", "");
        setField(term46051, term46051.getClass(), "originalPath", null);
        setIntField(term46051, term46051.getClass(), "lastOffset", 0);
        setIntField(term46051, term46051.getClass(), "lastLine", 1);
        setField(term46051, term46051.getClass(), "code", null);
        setField(term46050, term46050.getClass(), "referenced", term46051);
        setField(term46050, term46050.getClass(), "fileName", "fhkbdRViHi");
        setField(term46050, term46050.getClass(), "originalPath", null);
        setIntField(term46050, term46050.getClass(), "lastOffset", 0);
        setIntField(term46050, term46050.getClass(), "lastLine", 1);
        setField(term46050, term46050.getClass(), "code", null);
        Object term46072 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term46073 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        Object term46074 = newInstance(Class.forName("java.io.File"));
        setField(term46074, term46074.getClass(), "path", null);
        setField(term46074, term46074.getClass(), "status", null);
        setIntField(term46074, term46074.getClass(), "prefixLength", 0);
        setField(term46074, term46074.getClass(), "filePath", null);
        setField(term46073, term46073.getClass(), "file", term46074);
        setField(term46073, term46073.getClass(), "inputCharset", "");
        setField(term46073, term46073.getClass(), "fileName", "");
        setField(term46073, term46073.getClass(), "originalPath", null);
        setIntField(term46073, term46073.getClass(), "lastOffset", 0);
        setIntField(term46073, term46073.getClass(), "lastLine", 1);
        setField(term46073, term46073.getClass(), "code", null);
        setField(term46072, term46072.getClass(), "referenced", term46073);
        setField(term46072, term46072.getClass(), "fileName", "uWHnvSvaPl");
        setField(term46072, term46072.getClass(), "originalPath", null);
        setIntField(term46072, term46072.getClass(), "lastOffset", 0);
        setIntField(term46072, term46072.getClass(), "lastLine", 1);
        setField(term46072, term46072.getClass(), "code", null);
        Object term46094 = newInstance(Class.forName("com.google.javascript.jscomp.JSSourceFile"));
        Object term46095 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        Object term46096 = newInstance(Class.forName("java.io.File"));
        setField(term46096, term46096.getClass(), "path", null);
        setField(term46096, term46096.getClass(), "status", null);
        setIntField(term46096, term46096.getClass(), "prefixLength", 0);
        setField(term46096, term46096.getClass(), "filePath", null);
        setField(term46095, term46095.getClass(), "file", term46096);
        setField(term46095, term46095.getClass(), "inputCharset", "");
        setField(term46095, term46095.getClass(), "fileName", "");
        setField(term46095, term46095.getClass(), "originalPath", null);
        setIntField(term46095, term46095.getClass(), "lastOffset", 0);
        setIntField(term46095, term46095.getClass(), "lastLine", 1);
        setField(term46095, term46095.getClass(), "code", null);
        setField(term46094, term46094.getClass(), "referenced", term46095);
        setField(term46094, term46094.getClass(), "fileName", "");
        setField(term46094, term46094.getClass(), "originalPath", null);
        setIntField(term46094, term46094.getClass(), "lastOffset", 0);
        setIntField(term46094, term46094.getClass(), "lastLine", 1);
        setField(term46094, term46094.getClass(), "code", null);
        term46048 = new ArrayList();
        ((ArrayList) term46048).add(term46050);
        ((ArrayList) term46048).add(term46072);
        ((ArrayList) term46048).add(term46094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AbstractCommandLineRunner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9259;
        Object retValue = callMethod(klass, "createSourceInputs", argTypes, null, args);
        assertTrue(recursiveEquals(term9259, term46139));
        assertTrue(recursiveEquals(retValue, term46048));
    }

};


