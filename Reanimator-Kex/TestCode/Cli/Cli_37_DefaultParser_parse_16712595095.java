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
import java.util.LinkedList;
import java.util.LinkedHashMap;

public class DefaultParser_parse_16712595095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356444;
     Object term356692;
     Object term356230;
     Object term356875;
     Object term356886;
     Object term356890;
     Object term356841;

    public DefaultParser_parse_16712595095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term356626 = new ArrayList();
        term356444 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term356510 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term356574 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term356444, term356444.getClass(), "options", term356510);
        setBooleanField(term356444, term356444.getClass(), "stopAtNonOption", false);
        setBooleanField(term356444, term356444.getClass(), "skipParsing", false);
        setField(term356444, term356444.getClass(), "currentOption", term356574);
        setField(term356444, term356444.getClass(), "expectedOpts", term356626);
        setField(term356444, term356444.getClass(), "cmd", null);
        LinkedList term356746 = new LinkedList();
        LinkedHashMap term356806 = new LinkedHashMap();
        term356692 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term356692, term356692.getClass(), "requiredOpts", term356746);
        setField(term356692, term356692.getClass(), "optionGroups", term356806);
        term356230 = (Object[]) newArray("java.lang.String", 0);
        LinkedList term356877 = new LinkedList();
        ArrayList term356878 = new ArrayList();
        LinkedList term356881 = new LinkedList();
        LinkedHashMap term356882 = new LinkedHashMap();
        ArrayList term356884 = new ArrayList();
        term356875 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term356876 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term356880 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term356876, term356876.getClass(), "args", term356877);
        setField(term356876, term356876.getClass(), "options", term356878);
        setField(term356875, term356875.getClass(), "cmd", term356876);
        setField(term356880, term356880.getClass(), "shortOpts", null);
        setField(term356880, term356880.getClass(), "longOpts", null);
        setField(term356880, term356880.getClass(), "requiredOpts", term356881);
        setField(term356880, term356880.getClass(), "optionGroups", term356882);
        setField(term356875, term356875.getClass(), "options", term356880);
        setBooleanField(term356875, term356875.getClass(), "stopAtNonOption", false);
        setField(term356875, term356875.getClass(), "currentToken", null);
        setField(term356875, term356875.getClass(), "currentOption", null);
        setBooleanField(term356875, term356875.getClass(), "skipParsing", false);
        setField(term356875, term356875.getClass(), "expectedOpts", term356884);
        LinkedList term356887 = new LinkedList();
        LinkedHashMap term356888 = new LinkedHashMap();
        term356886 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term356886, term356886.getClass(), "shortOpts", null);
        setField(term356886, term356886.getClass(), "longOpts", null);
        setField(term356886, term356886.getClass(), "requiredOpts", term356887);
        setField(term356886, term356886.getClass(), "optionGroups", term356888);
        term356890 = (Object[]) newArray("java.lang.String", 0);
        LinkedList term356842 = new LinkedList();
        ArrayList term356845 = new ArrayList();
        term356841 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term356841, term356841.getClass(), "args", term356842);
        setField(term356841, term356841.getClass(), "options", term356845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term356692;
        args[1] = term356230;
        Object retValue = callMethod(klass, "parse", argTypes, term356444, args);
        assertTrue(recursiveEquals(term356444, term356875));
        assertTrue(recursiveEquals(term356692, term356886));
        assertTrue(recursiveEquals(term356230, term356890));
        assertTrue(recursiveEquals(retValue, term356841));
    }

};


