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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term92;
     Object term119;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term90, term90.getClass(), "late", true);
        setField(term90, term90.getClass(), "compiler", null);
        term92 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term98 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term92, term92.getClass(), "type", -203030934);
        setIntField(term94, term94.getClass(), "type", -1179120542);
        setIntField(term96, term96.getClass(), "type", -73683645);
        setIntField(term98, term98.getClass(), "type", -226514366);
        setIntField(term100, term100.getClass(), "type", 1193880199);
        setField(term100, term100.getClass(), "next", null);
        setField(term100, term100.getClass(), "first", null);
        setField(term100, term100.getClass(), "last", null);
        setField(term100, term100.getClass(), "propListHead", null);
        setIntField(term100, term100.getClass(), "sourcePosition", 0);
        setField(term100, term100.getClass(), "jsType", null);
        setField(term100, term100.getClass(), "parent", null);
        setField(term98, term98.getClass(), "next", term100);
        setIntField(term103, term103.getClass(), "type", -1087774327);
        setField(term103, term103.getClass(), "next", null);
        setField(term103, term103.getClass(), "first", null);
        setField(term103, term103.getClass(), "last", term100);
        setField(term103, term103.getClass(), "propListHead", null);
        setIntField(term103, term103.getClass(), "sourcePosition", 0);
        setField(term103, term103.getClass(), "jsType", null);
        setField(term103, term103.getClass(), "parent", null);
        setField(term98, term98.getClass(), "first", term103);
        setField(term98, term98.getClass(), "last", term96);
        setField(term98, term98.getClass(), "propListHead", null);
        setIntField(term98, term98.getClass(), "sourcePosition", 0);
        setField(term98, term98.getClass(), "jsType", null);
        setField(term98, term98.getClass(), "parent", null);
        setField(term96, term96.getClass(), "next", term98);
        setField(term96, term96.getClass(), "first", term100);
        setIntField(term107, term107.getClass(), "type", -469968304);
        setIntField(term109, term109.getClass(), "type", -1145578966);
        setField(term109, term109.getClass(), "next", null);
        setField(term109, term109.getClass(), "first", term103);
        setField(term109, term109.getClass(), "last", term98);
        setField(term109, term109.getClass(), "propListHead", null);
        setIntField(term109, term109.getClass(), "sourcePosition", 0);
        setField(term109, term109.getClass(), "jsType", null);
        setField(term109, term109.getClass(), "parent", null);
        setField(term107, term107.getClass(), "next", term109);
        setField(term107, term107.getClass(), "first", term94);
        setField(term107, term107.getClass(), "last", term94);
        setField(term107, term107.getClass(), "propListHead", null);
        setIntField(term107, term107.getClass(), "sourcePosition", 0);
        setField(term107, term107.getClass(), "jsType", null);
        setField(term107, term107.getClass(), "parent", null);
        setField(term96, term96.getClass(), "last", term107);
        setField(term96, term96.getClass(), "propListHead", null);
        setIntField(term96, term96.getClass(), "sourcePosition", 0);
        setField(term96, term96.getClass(), "jsType", null);
        setField(term96, term96.getClass(), "parent", null);
        setField(term94, term94.getClass(), "next", term96);
        setIntField(term114, term114.getClass(), "type", 679763016);
        setField(term114, term114.getClass(), "next", term107);
        setField(term114, term114.getClass(), "first", term109);
        setField(term114, term114.getClass(), "last", term92);
        setField(term114, term114.getClass(), "propListHead", null);
        setIntField(term114, term114.getClass(), "sourcePosition", 0);
        setField(term114, term114.getClass(), "jsType", null);
        setField(term114, term114.getClass(), "parent", null);
        setField(term94, term94.getClass(), "first", term114);
        setField(term94, term94.getClass(), "last", term114);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term92, term92.getClass(), "next", term94);
        setField(term92, term92.getClass(), "first", term98);
        setField(term92, term92.getClass(), "last", term100);
        setField(term92, term92.getClass(), "propListHead", null);
        setIntField(term92, term92.getClass(), "sourcePosition", 0);
        setField(term92, term92.getClass(), "jsType", null);
        setField(term92, term92.getClass(), "parent", null);
        term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term121 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term119, term119.getClass(), "type", 1962444399);
        setIntField(term121, term121.getClass(), "type", 767834723);
        setIntField(term123, term123.getClass(), "type", -602026508);
        setIntField(term125, term125.getClass(), "type", -157887805);
        setIntField(term127, term127.getClass(), "type", 1876565163);
        setField(term127, term127.getClass(), "next", null);
        setField(term127, term127.getClass(), "first", null);
        setField(term127, term127.getClass(), "last", null);
        setField(term127, term127.getClass(), "propListHead", null);
        setIntField(term127, term127.getClass(), "sourcePosition", 0);
        setField(term127, term127.getClass(), "jsType", null);
        setField(term127, term127.getClass(), "parent", null);
        setField(term125, term125.getClass(), "next", term127);
        setIntField(term130, term130.getClass(), "type", -817164822);
        setField(term130, term130.getClass(), "next", null);
        setField(term130, term130.getClass(), "first", null);
        setField(term130, term130.getClass(), "last", term127);
        setField(term130, term130.getClass(), "propListHead", null);
        setIntField(term130, term130.getClass(), "sourcePosition", 0);
        setField(term130, term130.getClass(), "jsType", null);
        setField(term130, term130.getClass(), "parent", null);
        setField(term125, term125.getClass(), "first", term130);
        setField(term125, term125.getClass(), "last", term123);
        setField(term125, term125.getClass(), "propListHead", null);
        setIntField(term125, term125.getClass(), "sourcePosition", 0);
        setField(term125, term125.getClass(), "jsType", null);
        setField(term125, term125.getClass(), "parent", null);
        setField(term123, term123.getClass(), "next", term125);
        setField(term123, term123.getClass(), "first", term127);
        setIntField(term134, term134.getClass(), "type", -1968847291);
        setIntField(term136, term136.getClass(), "type", 579005622);
        setField(term136, term136.getClass(), "next", null);
        setField(term136, term136.getClass(), "first", term130);
        setField(term136, term136.getClass(), "last", term125);
        setField(term136, term136.getClass(), "propListHead", null);
        setIntField(term136, term136.getClass(), "sourcePosition", 0);
        setField(term136, term136.getClass(), "jsType", null);
        setField(term136, term136.getClass(), "parent", null);
        setField(term134, term134.getClass(), "next", term136);
        setField(term134, term134.getClass(), "first", term121);
        setField(term134, term134.getClass(), "last", term121);
        setField(term134, term134.getClass(), "propListHead", null);
        setIntField(term134, term134.getClass(), "sourcePosition", 0);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setField(term123, term123.getClass(), "last", term134);
        setField(term123, term123.getClass(), "propListHead", null);
        setIntField(term123, term123.getClass(), "sourcePosition", 0);
        setField(term123, term123.getClass(), "jsType", null);
        setField(term123, term123.getClass(), "parent", null);
        setField(term121, term121.getClass(), "next", term123);
        setIntField(term141, term141.getClass(), "type", -14890619);
        setField(term141, term141.getClass(), "next", term134);
        setField(term141, term141.getClass(), "first", term136);
        setField(term141, term141.getClass(), "last", term119);
        setField(term141, term141.getClass(), "propListHead", null);
        setIntField(term141, term141.getClass(), "sourcePosition", 0);
        setField(term141, term141.getClass(), "jsType", null);
        setField(term141, term141.getClass(), "parent", null);
        setField(term121, term121.getClass(), "first", term141);
        setField(term121, term121.getClass(), "last", term141);
        setField(term121, term121.getClass(), "propListHead", null);
        setIntField(term121, term121.getClass(), "sourcePosition", 0);
        setField(term121, term121.getClass(), "jsType", null);
        setField(term121, term121.getClass(), "parent", null);
        setField(term119, term119.getClass(), "next", term121);
        setField(term119, term119.getClass(), "first", term125);
        setField(term119, term119.getClass(), "last", term127);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term92;
        args[1] = term119;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term90, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


