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
import java.lang.Object;

public class Normalize_process_16932396664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term117;
     Object term144;

    public Normalize_process_16932396664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term115, term115.getClass(), "compiler", null);
        setBooleanField(term115, term115.getClass(), "assertOnChange", false);
        term117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term140 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term117, term117.getClass(), "type", 391863371);
        setIntField(term119, term119.getClass(), "type", -2038273078);
        setIntField(term121, term121.getClass(), "type", 0);
        setField(term121, term121.getClass(), "next", null);
        setField(term121, term121.getClass(), "first", null);
        setField(term121, term121.getClass(), "last", null);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        setField(term119, term119.getClass(), "next", term121);
        setIntField(term124, term124.getClass(), "type", 0);
        setField(term124, term124.getClass(), "next", null);
        setField(term124, term124.getClass(), "first", null);
        setField(term124, term124.getClass(), "last", null);
        setField(term124, term124.getClass(), "propListHead", null);
        setIntField(term124, term124.getClass(), "sourcePosition", 0);
        setField(term124, term124.getClass(), "jsType", null);
        setField(term124, term124.getClass(), "parent", null);
        setField(term119, term119.getClass(), "first", term124);
        setIntField(term127, term127.getClass(), "type", 0);
        setField(term127, term127.getClass(), "next", null);
        setField(term127, term127.getClass(), "first", null);
        setField(term127, term127.getClass(), "last", null);
        setField(term127, term127.getClass(), "propListHead", null);
        setIntField(term127, term127.getClass(), "sourcePosition", 0);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        setField(term119, term119.getClass(), "last", term127);
        setField(term130, term130.getClass(), "next", null);
        setIntField(term130, term130.getClass(), "type", 0);
        setIntField(term130, term130.getClass(), "intValue", 0);
        setField(term130, term130.getClass(), "objectValue", null);
        setField(term119, term119.getClass(), "propListHead", term130);
        setIntField(term119, term119.getClass(), "sourcePosition", 1725571209);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term117, term117.getClass(), "next", term119);
        setIntField(term134, term134.getClass(), "type", 0);
        setField(term134, term134.getClass(), "next", null);
        setField(term134, term134.getClass(), "first", null);
        setField(term134, term134.getClass(), "last", null);
        setField(term134, term134.getClass(), "propListHead", null);
        setIntField(term134, term134.getClass(), "sourcePosition", 0);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setField(term117, term117.getClass(), "first", term134);
        setIntField(term137, term137.getClass(), "type", 0);
        setField(term137, term137.getClass(), "next", null);
        setField(term137, term137.getClass(), "first", null);
        setField(term137, term137.getClass(), "last", null);
        setField(term137, term137.getClass(), "propListHead", null);
        setIntField(term137, term137.getClass(), "sourcePosition", 0);
        setField(term137, term137.getClass(), "jsType", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term117, term117.getClass(), "last", term137);
        setField(term140, term140.getClass(), "next", null);
        setIntField(term140, term140.getClass(), "type", 0);
        setIntField(term140, term140.getClass(), "intValue", 0);
        setField(term140, term140.getClass(), "objectValue", null);
        setField(term117, term117.getClass(), "propListHead", term140);
        setIntField(term117, term117.getClass(), "sourcePosition", -522618178);
        setField(term117, term117.getClass(), "jsType", null);
        setField(term117, term117.getClass(), "parent", null);
        term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term167 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term144, term144.getClass(), "type", 597278769);
        setIntField(term146, term146.getClass(), "type", 1048535127);
        setIntField(term148, term148.getClass(), "type", 0);
        setField(term148, term148.getClass(), "next", null);
        setField(term148, term148.getClass(), "first", null);
        setField(term148, term148.getClass(), "last", null);
        setField(term148, term148.getClass(), "propListHead", null);
        setIntField(term148, term148.getClass(), "sourcePosition", 0);
        setField(term148, term148.getClass(), "jsType", null);
        setField(term148, term148.getClass(), "parent", null);
        setField(term146, term146.getClass(), "next", term148);
        setIntField(term151, term151.getClass(), "type", 0);
        setField(term151, term151.getClass(), "next", null);
        setField(term151, term151.getClass(), "first", null);
        setField(term151, term151.getClass(), "last", null);
        setField(term151, term151.getClass(), "propListHead", null);
        setIntField(term151, term151.getClass(), "sourcePosition", 0);
        setField(term151, term151.getClass(), "jsType", null);
        setField(term151, term151.getClass(), "parent", null);
        setField(term146, term146.getClass(), "first", term151);
        setIntField(term154, term154.getClass(), "type", 0);
        setField(term154, term154.getClass(), "next", null);
        setField(term154, term154.getClass(), "first", null);
        setField(term154, term154.getClass(), "last", null);
        setField(term154, term154.getClass(), "propListHead", null);
        setIntField(term154, term154.getClass(), "sourcePosition", 0);
        setField(term154, term154.getClass(), "jsType", null);
        setField(term154, term154.getClass(), "parent", null);
        setField(term146, term146.getClass(), "last", term154);
        setField(term157, term157.getClass(), "next", null);
        setIntField(term157, term157.getClass(), "type", 0);
        setIntField(term157, term157.getClass(), "intValue", 0);
        setField(term157, term157.getClass(), "objectValue", null);
        setField(term146, term146.getClass(), "propListHead", term157);
        setIntField(term146, term146.getClass(), "sourcePosition", -2068769794);
        setField(term146, term146.getClass(), "jsType", null);
        setField(term146, term146.getClass(), "parent", null);
        setField(term144, term144.getClass(), "next", term146);
        setIntField(term161, term161.getClass(), "type", 0);
        setField(term161, term161.getClass(), "next", null);
        setField(term161, term161.getClass(), "first", null);
        setField(term161, term161.getClass(), "last", null);
        setField(term161, term161.getClass(), "propListHead", null);
        setIntField(term161, term161.getClass(), "sourcePosition", 0);
        setField(term161, term161.getClass(), "jsType", null);
        setField(term161, term161.getClass(), "parent", null);
        setField(term144, term144.getClass(), "first", term161);
        setIntField(term164, term164.getClass(), "type", 0);
        setField(term164, term164.getClass(), "next", null);
        setField(term164, term164.getClass(), "first", null);
        setField(term164, term164.getClass(), "last", null);
        setField(term164, term164.getClass(), "propListHead", null);
        setIntField(term164, term164.getClass(), "sourcePosition", 0);
        setField(term164, term164.getClass(), "jsType", null);
        setField(term164, term164.getClass(), "parent", null);
        setField(term144, term144.getClass(), "last", term164);
        setField(term167, term167.getClass(), "next", null);
        setIntField(term167, term167.getClass(), "type", 0);
        setIntField(term167, term167.getClass(), "intValue", 0);
        setField(term167, term167.getClass(), "objectValue", null);
        setField(term144, term144.getClass(), "propListHead", term167);
        setIntField(term144, term144.getClass(), "sourcePosition", -117576464);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term117;
        args[1] = term144;
        callMethod(klass, "process", argTypes, term115, args);
    }

};


