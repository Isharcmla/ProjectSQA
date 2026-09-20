package com.google.gson;

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
import java.lang.IllegalArgumentException;
import static com.google.gson.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInfoFactory_getActualType_635383125108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271645;

    public TypeInfoFactory_getActualType_635383125108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271645 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term271723 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term271801 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term271879 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term271957 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272035 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272113 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272191 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272269 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272347 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272425 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272503 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272581 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272659 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272737 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272815 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272893 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term272971 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273049 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273127 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273205 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273283 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273361 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273439 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273517 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273595 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273673 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273751 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273829 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273907 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term273985 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274063 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274141 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274219 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274297 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274375 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274453 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274531 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274609 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274687 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274765 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274843 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274921 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term274999 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275077 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275155 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275233 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275311 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275389 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275467 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275545 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275623 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275701 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275779 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275857 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term275935 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term276013 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term276091 = newInstance(Class.forName("com.google.gson.GenericArrayTypeImpl"));
        Object term276171 = newInstance(Class.forName("com.google.gson.ParameterizedTypeImpl"));
        setField(term276091, term276091.getClass(), "genericComponentType", term276171);
        setField(term276013, term276013.getClass(), "genericComponentType", term276091);
        setField(term275935, term275935.getClass(), "genericComponentType", term276013);
        setField(term275857, term275857.getClass(), "genericComponentType", term275935);
        setField(term275779, term275779.getClass(), "genericComponentType", term275857);
        setField(term275701, term275701.getClass(), "genericComponentType", term275779);
        setField(term275623, term275623.getClass(), "genericComponentType", term275701);
        setField(term275545, term275545.getClass(), "genericComponentType", term275623);
        setField(term275467, term275467.getClass(), "genericComponentType", term275545);
        setField(term275389, term275389.getClass(), "genericComponentType", term275467);
        setField(term275311, term275311.getClass(), "genericComponentType", term275389);
        setField(term275233, term275233.getClass(), "genericComponentType", term275311);
        setField(term275155, term275155.getClass(), "genericComponentType", term275233);
        setField(term275077, term275077.getClass(), "genericComponentType", term275155);
        setField(term274999, term274999.getClass(), "genericComponentType", term275077);
        setField(term274921, term274921.getClass(), "genericComponentType", term274999);
        setField(term274843, term274843.getClass(), "genericComponentType", term274921);
        setField(term274765, term274765.getClass(), "genericComponentType", term274843);
        setField(term274687, term274687.getClass(), "genericComponentType", term274765);
        setField(term274609, term274609.getClass(), "genericComponentType", term274687);
        setField(term274531, term274531.getClass(), "genericComponentType", term274609);
        setField(term274453, term274453.getClass(), "genericComponentType", term274531);
        setField(term274375, term274375.getClass(), "genericComponentType", term274453);
        setField(term274297, term274297.getClass(), "genericComponentType", term274375);
        setField(term274219, term274219.getClass(), "genericComponentType", term274297);
        setField(term274141, term274141.getClass(), "genericComponentType", term274219);
        setField(term274063, term274063.getClass(), "genericComponentType", term274141);
        setField(term273985, term273985.getClass(), "genericComponentType", term274063);
        setField(term273907, term273907.getClass(), "genericComponentType", term273985);
        setField(term273829, term273829.getClass(), "genericComponentType", term273907);
        setField(term273751, term273751.getClass(), "genericComponentType", term273829);
        setField(term273673, term273673.getClass(), "genericComponentType", term273751);
        setField(term273595, term273595.getClass(), "genericComponentType", term273673);
        setField(term273517, term273517.getClass(), "genericComponentType", term273595);
        setField(term273439, term273439.getClass(), "genericComponentType", term273517);
        setField(term273361, term273361.getClass(), "genericComponentType", term273439);
        setField(term273283, term273283.getClass(), "genericComponentType", term273361);
        setField(term273205, term273205.getClass(), "genericComponentType", term273283);
        setField(term273127, term273127.getClass(), "genericComponentType", term273205);
        setField(term273049, term273049.getClass(), "genericComponentType", term273127);
        setField(term272971, term272971.getClass(), "genericComponentType", term273049);
        setField(term272893, term272893.getClass(), "genericComponentType", term272971);
        setField(term272815, term272815.getClass(), "genericComponentType", term272893);
        setField(term272737, term272737.getClass(), "genericComponentType", term272815);
        setField(term272659, term272659.getClass(), "genericComponentType", term272737);
        setField(term272581, term272581.getClass(), "genericComponentType", term272659);
        setField(term272503, term272503.getClass(), "genericComponentType", term272581);
        setField(term272425, term272425.getClass(), "genericComponentType", term272503);
        setField(term272347, term272347.getClass(), "genericComponentType", term272425);
        setField(term272269, term272269.getClass(), "genericComponentType", term272347);
        setField(term272191, term272191.getClass(), "genericComponentType", term272269);
        setField(term272113, term272113.getClass(), "genericComponentType", term272191);
        setField(term272035, term272035.getClass(), "genericComponentType", term272113);
        setField(term271957, term271957.getClass(), "genericComponentType", term272035);
        setField(term271879, term271879.getClass(), "genericComponentType", term271957);
        setField(term271801, term271801.getClass(), "genericComponentType", term271879);
        setField(term271723, term271723.getClass(), "genericComponentType", term271801);
        setField(term271645, term271645.getClass(), "genericComponentType", term271723);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.TypeInfoFactory");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.reflect.Type");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = term271645;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "getActualType", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
