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
import java.lang.Boolean;

public class HelpFormatter_printHelp_110574461722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1347;
     Object term1375;
     Object term1401;
     Object term1433;

    public HelpFormatter_printHelp_110574461722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1347 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term1347, term1347.getClass(), "defaultWidth", 74);
        setIntField(term1347, term1347.getClass(), "defaultLeftPad", 1);
        setIntField(term1347, term1347.getClass(), "defaultDescPad", 3);
        setField(term1347, term1347.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1347, term1347.getClass(), "defaultNewLine", "\n");
        setField(term1347, term1347.getClass(), "defaultOptPrefix", "-");
        setField(term1347, term1347.getClass(), "defaultLongOptPrefix", "--");
        setField(term1347, term1347.getClass(), "defaultArgName", "arg");
        term1375 = new Integer(-1922583790);
        HashMap term1402 = new HashMap();
        HashMap term1407 = new HashMap();
        ArrayList term1412 = new ArrayList();
        HashMap term1416 = new HashMap();
        term1401 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1401, term1401.getClass(), "shortOpts", term1402);
        setField(term1401, term1401.getClass(), "longOpts", term1407);
        setField(term1401, term1401.getClass(), "requiredOpts", term1412);
        setField(term1401, term1401.getClass(), "optionGroups", term1416);
        term1433 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.apache.commons.cli.Options");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term1375;
        args[1] = "ZiaGIbnzTs";
        args[2] = "tbcdzjIfER";
        args[3] = term1401;
        args[4] = "HyxfbSQYBe";
        args[5] = term1433;
        callMethod(klass, "printHelp", argTypes, term1347, args);
    }

};


