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

public class DefaultParser_checkRequiredOptions_213268135430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1398;
     Object term7740;

    public DefaultParser_checkRequiredOptions_213268135430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1400 = new LinkedList();
        ArrayList term1403 = new ArrayList();
        LinkedHashMap term1408 = new LinkedHashMap();
        LinkedHashMap term1414 = new LinkedHashMap();
        ArrayList term1420 = new ArrayList();
        LinkedHashMap term1424 = new LinkedHashMap();
        ArrayList term1495 = new ArrayList();
        ((ArrayList) term1495).add("");
        ((ArrayList) term1495).add("");
        ((ArrayList) term1495).add("");
        ((ArrayList) term1495).add("");
        ((ArrayList) term1495).add("");
        ArrayList term1506 = new ArrayList();
        term1398 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1399 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1407 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1443 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1399, term1399.getClass(), "args", term1400);
        setField(term1399, term1399.getClass(), "options", term1403);
        setField(term1398, term1398.getClass(), "cmd", term1399);
        setField(term1407, term1407.getClass(), "shortOpts", term1408);
        setField(term1407, term1407.getClass(), "longOpts", term1414);
        setField(term1407, term1407.getClass(), "requiredOpts", term1420);
        setField(term1407, term1407.getClass(), "optionGroups", term1424);
        setField(term1398, term1398.getClass(), "options", term1407);
        setBooleanField(term1398, term1398.getClass(), "stopAtNonOption", true);
        setField(term1398, term1398.getClass(), "currentToken", "MLqYREekMl");
        setField(term1443, term1443.getClass(), "opt", "ytSBIKXogI");
        setField(term1443, term1443.getClass(), "longOpt", "nHXjMycHlU");
        setField(term1443, term1443.getClass(), "argName", "ieCtQFdkii");
        setField(term1443, term1443.getClass(), "description", "dEnhdmILtU");
        setBooleanField(term1443, term1443.getClass(), "required", true);
        setBooleanField(term1443, term1443.getClass(), "optionalArg", true);
        setIntField(term1443, term1443.getClass(), "numberOfArgs", -616727354);
        setField(term1443, term1443.getClass(), "type", null);
        setField(term1443, term1443.getClass(), "values", term1495);
        setCharField(term1443, term1443.getClass(), "valuesep", 'n');
        setField(term1398, term1398.getClass(), "currentOption", term1443);
        setBooleanField(term1398, term1398.getClass(), "skipParsing", false);
        setField(term1398, term1398.getClass(), "expectedOpts", term1506);
        LinkedList term7742 = new LinkedList();
        ArrayList term7743 = new ArrayList();
        LinkedHashMap term7746 = new LinkedHashMap();
        LinkedHashMap term7747 = new LinkedHashMap();
        ArrayList term7748 = new ArrayList();
        LinkedHashMap term7750 = new LinkedHashMap();
        ArrayList term7762 = new ArrayList();
        ((ArrayList) term7762).add("");
        ((ArrayList) term7762).add("");
        ((ArrayList) term7762).add("");
        ((ArrayList) term7762).add("");
        ((ArrayList) term7762).add("");
        ArrayList term7769 = new ArrayList();
        term7740 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term7741 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term7745 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term7753 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7741, term7741.getClass(), "args", term7742);
        setField(term7741, term7741.getClass(), "options", term7743);
        setField(term7740, term7740.getClass(), "cmd", term7741);
        setField(term7745, term7745.getClass(), "shortOpts", term7746);
        setField(term7745, term7745.getClass(), "longOpts", term7747);
        setField(term7745, term7745.getClass(), "requiredOpts", term7748);
        setField(term7745, term7745.getClass(), "optionGroups", term7750);
        setField(term7740, term7740.getClass(), "options", term7745);
        setBooleanField(term7740, term7740.getClass(), "stopAtNonOption", true);
        setField(term7740, term7740.getClass(), "currentToken", "MLqYREekMl");
        setField(term7753, term7753.getClass(), "opt", "ytSBIKXogI");
        setField(term7753, term7753.getClass(), "longOpt", "nHXjMycHlU");
        setField(term7753, term7753.getClass(), "argName", "ieCtQFdkii");
        setField(term7753, term7753.getClass(), "description", "dEnhdmILtU");
        setBooleanField(term7753, term7753.getClass(), "required", true);
        setBooleanField(term7753, term7753.getClass(), "optionalArg", true);
        setIntField(term7753, term7753.getClass(), "numberOfArgs", -616727354);
        setField(term7753, term7753.getClass(), "type", null);
        setField(term7753, term7753.getClass(), "values", term7762);
        setCharField(term7753, term7753.getClass(), "valuesep", 'n');
        setField(term7740, term7740.getClass(), "currentOption", term7753);
        setBooleanField(term7740, term7740.getClass(), "skipParsing", false);
        setField(term7740, term7740.getClass(), "expectedOpts", term7769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkRequiredOptions", argTypes, term1398, args);
        assertTrue(recursiveEquals(term1398, term7740));
    }

};


