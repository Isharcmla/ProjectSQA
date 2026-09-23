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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_handleLongOption_214305057139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2995;
     Object term10670;

    public DefaultParser_handleLongOption_214305057139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2997 = new LinkedList();
        ArrayList term3000 = new ArrayList();
        LinkedHashMap term3005 = new LinkedHashMap();
        LinkedHashMap term3011 = new LinkedHashMap();
        ArrayList term3017 = new ArrayList();
        LinkedHashMap term3021 = new LinkedHashMap();
        ArrayList term3092 = new ArrayList();
        ((ArrayList) term3092).add("");
        ((ArrayList) term3092).add("");
        ArrayList term3100 = new ArrayList();
        term2995 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2996 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3004 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3040 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2996, term2996.getClass(), "args", term2997);
        setField(term2996, term2996.getClass(), "options", term3000);
        setField(term2995, term2995.getClass(), "cmd", term2996);
        setField(term3004, term3004.getClass(), "shortOpts", term3005);
        setField(term3004, term3004.getClass(), "longOpts", term3011);
        setField(term3004, term3004.getClass(), "requiredOpts", term3017);
        setField(term3004, term3004.getClass(), "optionGroups", term3021);
        setField(term2995, term2995.getClass(), "options", term3004);
        setBooleanField(term2995, term2995.getClass(), "stopAtNonOption", false);
        setField(term2995, term2995.getClass(), "currentToken", "ZzIujlwVsw");
        setField(term3040, term3040.getClass(), "opt", "LWyEaeIyAo");
        setField(term3040, term3040.getClass(), "longOpt", "yVMkkQhvmN");
        setField(term3040, term3040.getClass(), "argName", "mvrkADEgpp");
        setField(term3040, term3040.getClass(), "description", "pXOkjyeIRb");
        setBooleanField(term3040, term3040.getClass(), "required", false);
        setBooleanField(term3040, term3040.getClass(), "optionalArg", false);
        setIntField(term3040, term3040.getClass(), "numberOfArgs", 1585847225);
        setField(term3040, term3040.getClass(), "type", null);
        setField(term3040, term3040.getClass(), "values", term3092);
        setCharField(term3040, term3040.getClass(), "valuesep", 'A');
        setField(term2995, term2995.getClass(), "currentOption", term3040);
        setBooleanField(term2995, term2995.getClass(), "skipParsing", false);
        setField(term2995, term2995.getClass(), "expectedOpts", term3100);
        LinkedList term10672 = new LinkedList();
        ((LinkedList) term10672).add("");
        ArrayList term10675 = new ArrayList();
        LinkedHashMap term10678 = new LinkedHashMap();
        LinkedHashMap term10679 = new LinkedHashMap();
        ArrayList term10681 = new ArrayList();
        LinkedHashMap term10683 = new LinkedHashMap();
        ArrayList term10695 = new ArrayList();
        ((ArrayList) term10695).add("");
        ((ArrayList) term10695).add("");
        ArrayList term10699 = new ArrayList();
        term10670 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term10671 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term10677 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term10686 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10671, term10671.getClass(), "args", term10672);
        setField(term10671, term10671.getClass(), "options", term10675);
        setField(term10670, term10670.getClass(), "cmd", term10671);
        setField(term10677, term10677.getClass(), "shortOpts", term10678);
        setField(term10677, term10677.getClass(), "longOpts", term10679);
        setField(term10677, term10677.getClass(), "requiredOpts", term10681);
        setField(term10677, term10677.getClass(), "optionGroups", term10683);
        setField(term10670, term10670.getClass(), "options", term10677);
        setBooleanField(term10670, term10670.getClass(), "stopAtNonOption", false);
        setField(term10670, term10670.getClass(), "currentToken", "ZzIujlwVsw");
        setField(term10686, term10686.getClass(), "opt", "LWyEaeIyAo");
        setField(term10686, term10686.getClass(), "longOpt", "yVMkkQhvmN");
        setField(term10686, term10686.getClass(), "argName", "mvrkADEgpp");
        setField(term10686, term10686.getClass(), "description", "pXOkjyeIRb");
        setBooleanField(term10686, term10686.getClass(), "required", false);
        setBooleanField(term10686, term10686.getClass(), "optionalArg", false);
        setIntField(term10686, term10686.getClass(), "numberOfArgs", 1585847225);
        setField(term10686, term10686.getClass(), "type", null);
        setField(term10686, term10686.getClass(), "values", term10695);
        setCharField(term10686, term10686.getClass(), "valuesep", 'A');
        setField(term10670, term10670.getClass(), "currentOption", term10686);
        setBooleanField(term10670, term10670.getClass(), "skipParsing", false);
        setField(term10670, term10670.getClass(), "expectedOpts", term10699);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UfQtPRyWRC";
        callMethod(klass, "handleLongOption", argTypes, term2995, args);
        assertTrue(recursiveEquals(term2995, term10670));
    }

};


