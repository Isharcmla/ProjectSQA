package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_tryCatch_88809336899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1024;
     Object term1051;

    public IR_tryCatch_88809336899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1024, term1024.getClass(), "type", -1553893255);
        setIntField(term1026, term1026.getClass(), "type", 1303442927);
        setIntField(term1028, term1028.getClass(), "type", 794568325);
        setIntField(term1030, term1030.getClass(), "type", -434468428);
        setIntField(term1032, term1032.getClass(), "type", 1559605714);
        setField(term1032, term1032.getClass(), "next", null);
        setField(term1032, term1032.getClass(), "first", null);
        setField(term1032, term1032.getClass(), "last", null);
        setField(term1032, term1032.getClass(), "propListHead", null);
        setIntField(term1032, term1032.getClass(), "sourcePosition", 0);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "next", term1032);
        setIntField(term1035, term1035.getClass(), "type", 1146601902);
        setField(term1035, term1035.getClass(), "next", null);
        setField(term1035, term1035.getClass(), "first", null);
        setField(term1035, term1035.getClass(), "last", term1032);
        setField(term1035, term1035.getClass(), "propListHead", null);
        setIntField(term1035, term1035.getClass(), "sourcePosition", 0);
        setField(term1035, term1035.getClass(), "jsType", null);
        setField(term1035, term1035.getClass(), "parent", null);
        setField(term1030, term1030.getClass(), "first", term1035);
        setField(term1030, term1030.getClass(), "last", term1028);
        setField(term1030, term1030.getClass(), "propListHead", null);
        setIntField(term1030, term1030.getClass(), "sourcePosition", 0);
        setField(term1030, term1030.getClass(), "jsType", null);
        setField(term1030, term1030.getClass(), "parent", null);
        setField(term1028, term1028.getClass(), "next", term1030);
        setField(term1028, term1028.getClass(), "first", term1032);
        setIntField(term1039, term1039.getClass(), "type", -1629418973);
        setIntField(term1041, term1041.getClass(), "type", -100825168);
        setField(term1041, term1041.getClass(), "next", null);
        setField(term1041, term1041.getClass(), "first", term1035);
        setField(term1041, term1041.getClass(), "last", term1030);
        setField(term1041, term1041.getClass(), "propListHead", null);
        setIntField(term1041, term1041.getClass(), "sourcePosition", 0);
        setField(term1041, term1041.getClass(), "jsType", null);
        setField(term1041, term1041.getClass(), "parent", null);
        setField(term1039, term1039.getClass(), "next", term1041);
        setField(term1039, term1039.getClass(), "first", term1026);
        setField(term1039, term1039.getClass(), "last", term1026);
        setField(term1039, term1039.getClass(), "propListHead", null);
        setIntField(term1039, term1039.getClass(), "sourcePosition", 0);
        setField(term1039, term1039.getClass(), "jsType", null);
        setField(term1039, term1039.getClass(), "parent", null);
        setField(term1028, term1028.getClass(), "last", term1039);
        setField(term1028, term1028.getClass(), "propListHead", null);
        setIntField(term1028, term1028.getClass(), "sourcePosition", 0);
        setField(term1028, term1028.getClass(), "jsType", null);
        setField(term1028, term1028.getClass(), "parent", null);
        setField(term1026, term1026.getClass(), "next", term1028);
        setIntField(term1046, term1046.getClass(), "type", 768407648);
        setField(term1046, term1046.getClass(), "next", term1039);
        setField(term1046, term1046.getClass(), "first", term1041);
        setField(term1046, term1046.getClass(), "last", term1024);
        setField(term1046, term1046.getClass(), "propListHead", null);
        setIntField(term1046, term1046.getClass(), "sourcePosition", 0);
        setField(term1046, term1046.getClass(), "jsType", null);
        setField(term1046, term1046.getClass(), "parent", null);
        setField(term1026, term1026.getClass(), "first", term1046);
        setField(term1026, term1026.getClass(), "last", term1046);
        setField(term1026, term1026.getClass(), "propListHead", null);
        setIntField(term1026, term1026.getClass(), "sourcePosition", 0);
        setField(term1026, term1026.getClass(), "jsType", null);
        setField(term1026, term1026.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "next", term1026);
        setField(term1024, term1024.getClass(), "first", term1030);
        setField(term1024, term1024.getClass(), "last", term1032);
        setField(term1024, term1024.getClass(), "propListHead", null);
        setIntField(term1024, term1024.getClass(), "sourcePosition", 0);
        setField(term1024, term1024.getClass(), "jsType", null);
        setField(term1024, term1024.getClass(), "parent", null);
        term1051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1051, term1051.getClass(), "type", -350454594);
        setIntField(term1053, term1053.getClass(), "type", -1148142995);
        setIntField(term1055, term1055.getClass(), "type", -233024044);
        setIntField(term1057, term1057.getClass(), "type", 1820784228);
        setIntField(term1059, term1059.getClass(), "type", 1390820006);
        setField(term1059, term1059.getClass(), "next", null);
        setField(term1059, term1059.getClass(), "first", null);
        setField(term1059, term1059.getClass(), "last", null);
        setField(term1059, term1059.getClass(), "propListHead", null);
        setIntField(term1059, term1059.getClass(), "sourcePosition", 0);
        setField(term1059, term1059.getClass(), "jsType", null);
        setField(term1059, term1059.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "next", term1059);
        setIntField(term1062, term1062.getClass(), "type", -828982065);
        setField(term1062, term1062.getClass(), "next", null);
        setField(term1062, term1062.getClass(), "first", null);
        setField(term1062, term1062.getClass(), "last", term1059);
        setField(term1062, term1062.getClass(), "propListHead", null);
        setIntField(term1062, term1062.getClass(), "sourcePosition", 0);
        setField(term1062, term1062.getClass(), "jsType", null);
        setField(term1062, term1062.getClass(), "parent", null);
        setField(term1057, term1057.getClass(), "first", term1062);
        setField(term1057, term1057.getClass(), "last", term1055);
        setField(term1057, term1057.getClass(), "propListHead", null);
        setIntField(term1057, term1057.getClass(), "sourcePosition", 0);
        setField(term1057, term1057.getClass(), "jsType", null);
        setField(term1057, term1057.getClass(), "parent", null);
        setField(term1055, term1055.getClass(), "next", term1057);
        setField(term1055, term1055.getClass(), "first", term1059);
        setIntField(term1066, term1066.getClass(), "type", 908108726);
        setIntField(term1068, term1068.getClass(), "type", 1023209512);
        setField(term1068, term1068.getClass(), "next", null);
        setField(term1068, term1068.getClass(), "first", term1062);
        setField(term1068, term1068.getClass(), "last", term1057);
        setField(term1068, term1068.getClass(), "propListHead", null);
        setIntField(term1068, term1068.getClass(), "sourcePosition", 0);
        setField(term1068, term1068.getClass(), "jsType", null);
        setField(term1068, term1068.getClass(), "parent", null);
        setField(term1066, term1066.getClass(), "next", term1068);
        setField(term1066, term1066.getClass(), "first", term1053);
        setField(term1066, term1066.getClass(), "last", term1053);
        setField(term1066, term1066.getClass(), "propListHead", null);
        setIntField(term1066, term1066.getClass(), "sourcePosition", 0);
        setField(term1066, term1066.getClass(), "jsType", null);
        setField(term1066, term1066.getClass(), "parent", null);
        setField(term1055, term1055.getClass(), "last", term1066);
        setField(term1055, term1055.getClass(), "propListHead", null);
        setIntField(term1055, term1055.getClass(), "sourcePosition", 0);
        setField(term1055, term1055.getClass(), "jsType", null);
        setField(term1055, term1055.getClass(), "parent", null);
        setField(term1053, term1053.getClass(), "next", term1055);
        setIntField(term1073, term1073.getClass(), "type", 1084849225);
        setField(term1073, term1073.getClass(), "next", term1066);
        setField(term1073, term1073.getClass(), "first", term1068);
        setField(term1073, term1073.getClass(), "last", term1051);
        setField(term1073, term1073.getClass(), "propListHead", null);
        setIntField(term1073, term1073.getClass(), "sourcePosition", 0);
        setField(term1073, term1073.getClass(), "jsType", null);
        setField(term1073, term1073.getClass(), "parent", null);
        setField(term1053, term1053.getClass(), "first", term1073);
        setField(term1053, term1053.getClass(), "last", term1073);
        setField(term1053, term1053.getClass(), "propListHead", null);
        setIntField(term1053, term1053.getClass(), "sourcePosition", 0);
        setField(term1053, term1053.getClass(), "jsType", null);
        setField(term1053, term1053.getClass(), "parent", null);
        setField(term1051, term1051.getClass(), "next", term1053);
        setField(term1051, term1051.getClass(), "first", term1057);
        setField(term1051, term1051.getClass(), "last", term1059);
        setField(term1051, term1051.getClass(), "propListHead", null);
        setIntField(term1051, term1051.getClass(), "sourcePosition", 0);
        setField(term1051, term1051.getClass(), "jsType", null);
        setField(term1051, term1051.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1024;
        args[1] = term1051;
        try {
            callMethod(klass, "tryCatch", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


