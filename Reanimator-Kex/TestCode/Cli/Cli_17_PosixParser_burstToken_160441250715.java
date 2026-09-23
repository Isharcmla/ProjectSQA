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
     Object term3691;

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
        ArrayList term3692 = new ArrayList();
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("ijpHYOFuy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("jpHYOFuy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("pHYOFuy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("HYOFuy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("YOFuy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("OFuy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("Fuy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("uy");
        ((ArrayList) term3692).add("--");
        ((ArrayList) term3692).add("y");
        ArrayList term3740 = new ArrayList();
        LinkedList term3743 = new LinkedList();
        ArrayList term3744 = new ArrayList();
        ArrayList term3746 = new ArrayList();
        term3691 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term3730 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3739 = newInstance(Class.forName("java.lang.Object"));
        Object term3742 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term3691, term3691.getClass(), "tokens", term3692);
        setBooleanField(term3691, term3691.getClass(), "eatTheRest", true);
        setField(term3730, term3730.getClass(), "opt", "IoAlmYsBwc");
        setField(term3730, term3730.getClass(), "longOpt", "TEParAifyi");
        setField(term3730, term3730.getClass(), "argName", "OWDIEULEFu");
        setField(term3730, term3730.getClass(), "description", "dWRymuLBtr");
        setBooleanField(term3730, term3730.getClass(), "required", true);
        setBooleanField(term3730, term3730.getClass(), "optionalArg", true);
        setIntField(term3730, term3730.getClass(), "numberOfArgs", -1955890973);
        setField(term3730, term3730.getClass(), "type", term3739);
        setField(term3730, term3730.getClass(), "values", term3740);
        setCharField(term3730, term3730.getClass(), "valuesep", 'Z');
        setField(term3691, term3691.getClass(), "currentOption", term3730);
        setField(term3691, term3691.getClass(), "options", null);
        setField(term3742, term3742.getClass(), "args", term3743);
        setField(term3742, term3742.getClass(), "options", term3744);
        setField(term3691, term3691.getClass(), "cmd", term3742);
        setField(term3691, term3691.getClass(), "requiredOptions", term3746);
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
        assertTrue(recursiveEquals(term1050, term3691));
        assertTrue(recursiveEquals(term1178, true));
    }

};


