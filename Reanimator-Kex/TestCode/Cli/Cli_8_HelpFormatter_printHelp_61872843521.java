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
import java.lang.Integer;
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_printHelp_61872843521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;
     Object term1245;
     Object term1271;

    public HelpFormatter_printHelp_61872843521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1217 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term1217, term1217.getClass(), "defaultWidth", 74);
        setIntField(term1217, term1217.getClass(), "defaultLeftPad", 1);
        setIntField(term1217, term1217.getClass(), "defaultDescPad", 3);
        setField(term1217, term1217.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1217, term1217.getClass(), "defaultNewLine", "\n");
        setField(term1217, term1217.getClass(), "defaultOptPrefix", "-");
        setField(term1217, term1217.getClass(), "defaultLongOptPrefix", "--");
        setField(term1217, term1217.getClass(), "defaultArgName", "arg");
        term1245 = new Integer(391863371);
        HashMap term1272 = new HashMap();
        HashMap term1277 = new HashMap();
        ArrayList term1282 = new ArrayList();
        HashMap term1286 = new HashMap();
        term1271 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1271, term1271.getClass(), "shortOpts", term1272);
        setField(term1271, term1271.getClass(), "longOpts", term1277);
        setField(term1271, term1271.getClass(), "requiredOpts", term1282);
        setField(term1271, term1271.getClass(), "optionGroups", term1286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.apache.commons.cli.Options");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term1245;
        args[1] = "LQFpaHEwXR";
        args[2] = "oVcInYnLWB";
        args[3] = term1271;
        args[4] = "aJlieCFVtF";
        callMethod(klass, "printHelp", argTypes, term1217, args);
    }

};


