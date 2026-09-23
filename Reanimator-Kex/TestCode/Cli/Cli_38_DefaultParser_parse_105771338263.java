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
import java.util.LinkedList;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.ArrayList;

public class DefaultParser_parse_105771338263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28467;
     Object term28533;
     Object term28215;
     Object term28840;
     Object term28858;
     Object term28862;
     Object term28777;

    public DefaultParser_parse_105771338263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28467 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term28467, term28467.getClass(), "options", null);
        setBooleanField(term28467, term28467.getClass(), "stopAtNonOption", false);
        setBooleanField(term28467, term28467.getClass(), "skipParsing", false);
        setField(term28467, term28467.getClass(), "currentOption", null);
        setField(term28467, term28467.getClass(), "expectedOpts", null);
        setField(term28467, term28467.getClass(), "cmd", null);
        setField(term28467, term28467.getClass(), "currentToken", null);
        LinkedList term28587 = new LinkedList();
        LinkedHashMap term28647 = new LinkedHashMap();
        term28533 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term28533, term28533.getClass(), "requiredOpts", term28587);
        setField(term28533, term28533.getClass(), "optionGroups", term28647);
        term28215 = (Object[]) newArray("java.lang.String", 2);
        setElement(term28215, 0, "");
        setElement(term28215, 1, "");
        LinkedList term28842 = new LinkedList();
        ((LinkedList) term28842).add("");
        ((LinkedList) term28842).add("");
        ArrayList term28848 = new ArrayList();
        LinkedList term28851 = new LinkedList();
        LinkedHashMap term28852 = new LinkedHashMap();
        ArrayList term28856 = new ArrayList();
        term28840 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term28841 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term28850 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term28841, term28841.getClass(), "args", term28842);
        setField(term28841, term28841.getClass(), "options", term28848);
        setField(term28840, term28840.getClass(), "cmd", term28841);
        setField(term28850, term28850.getClass(), "shortOpts", null);
        setField(term28850, term28850.getClass(), "longOpts", null);
        setField(term28850, term28850.getClass(), "requiredOpts", term28851);
        setField(term28850, term28850.getClass(), "optionGroups", term28852);
        setField(term28840, term28840.getClass(), "options", term28850);
        setBooleanField(term28840, term28840.getClass(), "stopAtNonOption", true);
        setField(term28840, term28840.getClass(), "currentToken", "");
        setField(term28840, term28840.getClass(), "currentOption", null);
        setBooleanField(term28840, term28840.getClass(), "skipParsing", true);
        setField(term28840, term28840.getClass(), "expectedOpts", term28856);
        LinkedList term28859 = new LinkedList();
        LinkedHashMap term28860 = new LinkedHashMap();
        term28858 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term28858, term28858.getClass(), "shortOpts", null);
        setField(term28858, term28858.getClass(), "longOpts", null);
        setField(term28858, term28858.getClass(), "requiredOpts", term28859);
        setField(term28858, term28858.getClass(), "optionGroups", term28860);
        term28862 = (Object[]) newArray("java.lang.String", 2);
        setElement(term28862, 0, "");
        setElement(term28862, 1, "");
        LinkedList term28778 = new LinkedList();
        ((LinkedList) term28778).add("");
        ((LinkedList) term28778).add("");
        ArrayList term28786 = new ArrayList();
        term28777 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term28777, term28777.getClass(), "args", term28778);
        setField(term28777, term28777.getClass(), "options", term28786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term28533;
        args[1] = term28215;
        args[2] = true;
        Object retValue = callMethod(klass, "parse", argTypes, term28467, args);
        assertTrue(recursiveEquals(term28467, term28840));
        assertTrue(recursiveEquals(term28533, term28858));
        assertTrue(recursiveEquals(term28215, term28862));
        assertTrue(recursiveEquals(retValue, term28777));
    }

};


