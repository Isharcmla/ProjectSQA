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
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class DefaultParser_parse_105771338293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355492;
     Object term355624;
     Object term355201;
     Object term355869;
     Object term355886;
     Object term355891;
     Object term355830;

    public DefaultParser_parse_105771338293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355492 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term355558 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term355492, term355492.getClass(), "options", term355558);
        setBooleanField(term355492, term355492.getClass(), "stopAtNonOption", false);
        setBooleanField(term355492, term355492.getClass(), "skipParsing", false);
        setField(term355492, term355492.getClass(), "currentOption", null);
        setField(term355492, term355492.getClass(), "expectedOpts", null);
        setField(term355492, term355492.getClass(), "cmd", null);
        setField(term355492, term355492.getClass(), "currentToken", null);
        ArrayList term355676 = new ArrayList();
        LinkedHashMap term355736 = new LinkedHashMap();
        term355624 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term355624, term355624.getClass(), "requiredOpts", term355676);
        setField(term355624, term355624.getClass(), "optionGroups", term355736);
        term355201 = (Object[]) newArray("java.lang.String", 1);
        setElement(term355201, 0, "");
        LinkedList term355871 = new LinkedList();
        ((LinkedList) term355871).add("");
        ArrayList term355875 = new ArrayList();
        ArrayList term355878 = new ArrayList();
        LinkedHashMap term355880 = new LinkedHashMap();
        ArrayList term355884 = new ArrayList();
        term355869 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term355870 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term355877 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term355870, term355870.getClass(), "args", term355871);
        setField(term355870, term355870.getClass(), "options", term355875);
        setField(term355869, term355869.getClass(), "cmd", term355870);
        setField(term355877, term355877.getClass(), "shortOpts", null);
        setField(term355877, term355877.getClass(), "longOpts", null);
        setField(term355877, term355877.getClass(), "requiredOpts", term355878);
        setField(term355877, term355877.getClass(), "optionGroups", term355880);
        setField(term355869, term355869.getClass(), "options", term355877);
        setBooleanField(term355869, term355869.getClass(), "stopAtNonOption", false);
        setField(term355869, term355869.getClass(), "currentToken", "");
        setField(term355869, term355869.getClass(), "currentOption", null);
        setBooleanField(term355869, term355869.getClass(), "skipParsing", false);
        setField(term355869, term355869.getClass(), "expectedOpts", term355884);
        ArrayList term355887 = new ArrayList();
        LinkedHashMap term355889 = new LinkedHashMap();
        term355886 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term355886, term355886.getClass(), "shortOpts", null);
        setField(term355886, term355886.getClass(), "longOpts", null);
        setField(term355886, term355886.getClass(), "requiredOpts", term355887);
        setField(term355886, term355886.getClass(), "optionGroups", term355889);
        term355891 = (Object[]) newArray("java.lang.String", 1);
        setElement(term355891, 0, "");
        LinkedList term355831 = new LinkedList();
        ((LinkedList) term355831).add("");
        ArrayList term355837 = new ArrayList();
        term355830 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term355830, term355830.getClass(), "args", term355831);
        setField(term355830, term355830.getClass(), "options", term355837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term355624;
        args[1] = term355201;
        args[2] = false;
        Object retValue = callMethod(klass, "parse", argTypes, term355492, args);
        assertTrue(recursiveEquals(term355492, term355869));
        assertTrue(recursiveEquals(term355624, term355886));
        assertTrue(recursiveEquals(term355201, term355891));
        assertTrue(recursiveEquals(retValue, term355830));
    }

};


