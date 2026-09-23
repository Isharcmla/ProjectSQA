package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class DefaultParser_parse_105771338253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19575;
     Object term19819;
     Object term19327;
     Object term20102;
     Object term20118;
     Object term20122;
     Object term20040;

    public DefaultParser_parse_105771338253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19575 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term19641 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term19715 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term19575, term19575.getClass(), "options", term19641);
        setBooleanField(term19575, term19575.getClass(), "stopAtNonOption", false);
        setBooleanField(term19575, term19575.getClass(), "skipParsing", false);
        setField(term19575, term19575.getClass(), "currentOption", null);
        setField(term19575, term19575.getClass(), "expectedOpts", null);
        setField(term19575, term19575.getClass(), "cmd", term19715);
        setField(term19575, term19575.getClass(), "currentToken", "");
        LinkedList term19865 = new LinkedList();
        LinkedHashMap term19925 = new LinkedHashMap();
        term19819 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term19819, term19819.getClass(), "requiredOpts", term19865);
        setField(term19819, term19819.getClass(), "optionGroups", term19925);
        term19327 = (Object[]) newArray("java.lang.String", 2);
        setElement(term19327, 0, "--");
        setElement(term19327, 1, "");
        LinkedList term20104 = new LinkedList();
        ((LinkedList) term20104).add("");
        ArrayList term20108 = new ArrayList();
        LinkedList term20111 = new LinkedList();
        LinkedHashMap term20112 = new LinkedHashMap();
        ArrayList term20116 = new ArrayList();
        term20102 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term20103 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term20110 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term20103, term20103.getClass(), "args", term20104);
        setField(term20103, term20103.getClass(), "options", term20108);
        setField(term20102, term20102.getClass(), "cmd", term20103);
        setField(term20110, term20110.getClass(), "shortOpts", null);
        setField(term20110, term20110.getClass(), "longOpts", null);
        setField(term20110, term20110.getClass(), "requiredOpts", term20111);
        setField(term20110, term20110.getClass(), "optionGroups", term20112);
        setField(term20102, term20102.getClass(), "options", term20110);
        setBooleanField(term20102, term20102.getClass(), "stopAtNonOption", true);
        setField(term20102, term20102.getClass(), "currentToken", "");
        setField(term20102, term20102.getClass(), "currentOption", null);
        setBooleanField(term20102, term20102.getClass(), "skipParsing", true);
        setField(term20102, term20102.getClass(), "expectedOpts", term20116);
        LinkedList term20119 = new LinkedList();
        LinkedHashMap term20120 = new LinkedHashMap();
        term20118 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term20118, term20118.getClass(), "shortOpts", null);
        setField(term20118, term20118.getClass(), "longOpts", null);
        setField(term20118, term20118.getClass(), "requiredOpts", term20119);
        setField(term20118, term20118.getClass(), "optionGroups", term20120);
        term20122 = (Object[]) newArray("java.lang.String", 2);
        setElement(term20122, 0, "--");
        setElement(term20122, 1, "");
        LinkedList term20041 = new LinkedList();
        ((LinkedList) term20041).add("");
        ArrayList term20047 = new ArrayList();
        term20040 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term20040, term20040.getClass(), "args", term20041);
        setField(term20040, term20040.getClass(), "options", term20047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term19819;
        args[1] = term19327;
        args[2] = true;
        Object retValue = callMethod(klass, "parse", argTypes, term19575, args);
        assertTrue(recursiveEquals(term19575, term20102));
        assertTrue(recursiveEquals(term19819, term20118));
        assertTrue(recursiveEquals(term19327, term20122));
        assertTrue(recursiveEquals(retValue, term20040));
    }

};


