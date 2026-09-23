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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;
import java.lang.Boolean;

public class PosixParser_burstToken_160441250715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1050;
     Object term1178;
     Object term2770;

    public PosixParser_burstToken_160441250715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1051 = new ArrayList();
        ArrayList term1109 = new ArrayList();
        HashMap term1143 = new HashMap();
        HashMap term1148 = new HashMap();
        ArrayList term1153 = new ArrayList();
        HashMap term1157 = new HashMap();
        LinkedList term1135 = new LinkedList();
        ArrayList term1138 = new ArrayList();
        ArrayList term1162 = new ArrayList();
        term1050 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term1056 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1108 = newInstance(Class.forName("java.lang.Object"));
        Object term1142 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1134 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term1050, term1050.getClass(), "tokens", term1051);
        setBooleanField(term1050, term1050.getClass(), "eatTheRest", true);
        setField(term1056, term1056.getClass(), "opt", "IoAlmYsBwc");
        setField(term1056, term1056.getClass(), "longOpt", "TEParAifyi");
        setField(term1056, term1056.getClass(), "argName", "OWDIEULEFu");
        setField(term1056, term1056.getClass(), "description", "dWRymuLBtr");
        setBooleanField(term1056, term1056.getClass(), "required", true);
        setBooleanField(term1056, term1056.getClass(), "optionalArg", true);
        setIntField(term1056, term1056.getClass(), "numberOfArgs", -1955890973);
        setField(term1056, term1056.getClass(), "type", term1108);
        setField(term1056, term1056.getClass(), "values", term1109);
        setCharField(term1056, term1056.getClass(), "valuesep", 'Z');
        setField(term1050, term1050.getClass(), "currentOption", term1056);
        setField(term1142, term1142.getClass(), "shortOpts", term1143);
        setField(term1142, term1142.getClass(), "longOpts", term1148);
        setField(term1142, term1142.getClass(), "requiredOpts", term1153);
        setField(term1142, term1142.getClass(), "optionGroups", term1157);
        setField(term1050, term1050.getClass(), "options", term1142);
        setField(term1134, term1134.getClass(), "args", term1135);
        setField(term1134, term1134.getClass(), "options", term1138);
        setField(term1050, term1050.getClass(), "cmd", term1134);
        setField(term1050, term1050.getClass(), "requiredOptions", term1162);
        term1178 = new Boolean(true);
        ArrayList term2771 = new ArrayList();
        ((ArrayList) term2771).add("--");
        ((ArrayList) term2771).add("ijpHYOFuy");
        ArrayList term2787 = new ArrayList();
        LinkedList term2790 = new LinkedList();
        ArrayList term2791 = new ArrayList();
        ArrayList term2793 = new ArrayList();
        term2770 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term2777 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2786 = newInstance(Class.forName("java.lang.Object"));
        Object term2789 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term2770, term2770.getClass(), "tokens", term2771);
        setBooleanField(term2770, term2770.getClass(), "eatTheRest", true);
        setField(term2777, term2777.getClass(), "opt", "IoAlmYsBwc");
        setField(term2777, term2777.getClass(), "longOpt", "TEParAifyi");
        setField(term2777, term2777.getClass(), "argName", "OWDIEULEFu");
        setField(term2777, term2777.getClass(), "description", "dWRymuLBtr");
        setBooleanField(term2777, term2777.getClass(), "required", true);
        setBooleanField(term2777, term2777.getClass(), "optionalArg", true);
        setIntField(term2777, term2777.getClass(), "numberOfArgs", -1955890973);
        setField(term2777, term2777.getClass(), "type", term2786);
        setField(term2777, term2777.getClass(), "values", term2787);
        setCharField(term2777, term2777.getClass(), "valuesep", 'Z');
        setField(term2770, term2770.getClass(), "currentOption", term2777);
        setField(term2770, term2770.getClass(), "options", null);
        setField(term2789, term2789.getClass(), "args", term2790);
        setField(term2789, term2789.getClass(), "options", term2791);
        setField(term2770, term2770.getClass(), "cmd", term2789);
        setField(term2770, term2770.getClass(), "requiredOptions", term2793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "AijpHYOFuy";
        args[1] = term1178;
        callMethod(klass, "burstToken", argTypes, term1050, args);
        assertTrue(recursiveEquals(term1050, term2770));
        assertTrue(recursiveEquals(term1178, true));
    }

};


