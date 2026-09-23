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
import java.util.HashMap;

public class DefaultParser_isNegativeNumber_118726945634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2026;
     Object term8724;

    public DefaultParser_isNegativeNumber_118726945634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2028 = new LinkedList();
        ArrayList term2031 = new ArrayList();
        HashMap term2036 = new HashMap();
        HashMap term2041 = new HashMap();
        ArrayList term2046 = new ArrayList();
        HashMap term2050 = new HashMap();
        ArrayList term2121 = new ArrayList();
        ArrayList term2127 = new ArrayList();
        term2026 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2027 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2035 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2068 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2120 = newInstance(Class.forName("java.lang.Object"));
        setField(term2027, term2027.getClass(), "args", term2028);
        setField(term2027, term2027.getClass(), "options", term2031);
        setField(term2026, term2026.getClass(), "cmd", term2027);
        setField(term2035, term2035.getClass(), "shortOpts", term2036);
        setField(term2035, term2035.getClass(), "longOpts", term2041);
        setField(term2035, term2035.getClass(), "requiredOpts", term2046);
        setField(term2035, term2035.getClass(), "optionGroups", term2050);
        setField(term2026, term2026.getClass(), "options", term2035);
        setBooleanField(term2026, term2026.getClass(), "stopAtNonOption", true);
        setField(term2026, term2026.getClass(), "currentToken", "uWHnvSvaPl");
        setField(term2068, term2068.getClass(), "opt", "kBdSllIBVz");
        setField(term2068, term2068.getClass(), "longOpt", "TJmVBGfTML");
        setField(term2068, term2068.getClass(), "argName", "tPlsykYBqO");
        setField(term2068, term2068.getClass(), "description", "bLPjGVBhlX");
        setBooleanField(term2068, term2068.getClass(), "required", false);
        setBooleanField(term2068, term2068.getClass(), "optionalArg", false);
        setIntField(term2068, term2068.getClass(), "numberOfArgs", -1339778481);
        setField(term2068, term2068.getClass(), "type", term2120);
        setField(term2068, term2068.getClass(), "values", term2121);
        setCharField(term2068, term2068.getClass(), "valuesep", 'D');
        setField(term2026, term2026.getClass(), "currentOption", term2068);
        setBooleanField(term2026, term2026.getClass(), "skipParsing", false);
        setField(term2026, term2026.getClass(), "expectedOpts", term2127);
        LinkedList term8726 = new LinkedList();
        ArrayList term8727 = new ArrayList();
        HashMap term8730 = new HashMap();
        HashMap term8731 = new HashMap();
        ArrayList term8732 = new ArrayList();
        HashMap term8734 = new HashMap();
        ArrayList term8747 = new ArrayList();
        ArrayList term8749 = new ArrayList();
        term8724 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term8725 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term8729 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term8737 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term8746 = newInstance(Class.forName("java.lang.Object"));
        setField(term8725, term8725.getClass(), "args", term8726);
        setField(term8725, term8725.getClass(), "options", term8727);
        setField(term8724, term8724.getClass(), "cmd", term8725);
        setField(term8729, term8729.getClass(), "shortOpts", term8730);
        setField(term8729, term8729.getClass(), "longOpts", term8731);
        setField(term8729, term8729.getClass(), "requiredOpts", term8732);
        setField(term8729, term8729.getClass(), "optionGroups", term8734);
        setField(term8724, term8724.getClass(), "options", term8729);
        setBooleanField(term8724, term8724.getClass(), "stopAtNonOption", true);
        setField(term8724, term8724.getClass(), "currentToken", "uWHnvSvaPl");
        setField(term8737, term8737.getClass(), "opt", "kBdSllIBVz");
        setField(term8737, term8737.getClass(), "longOpt", "TJmVBGfTML");
        setField(term8737, term8737.getClass(), "argName", "tPlsykYBqO");
        setField(term8737, term8737.getClass(), "description", "bLPjGVBhlX");
        setBooleanField(term8737, term8737.getClass(), "required", false);
        setBooleanField(term8737, term8737.getClass(), "optionalArg", false);
        setIntField(term8737, term8737.getClass(), "numberOfArgs", -1339778481);
        setField(term8737, term8737.getClass(), "type", term8746);
        setField(term8737, term8737.getClass(), "values", term8747);
        setCharField(term8737, term8737.getClass(), "valuesep", 'D');
        setField(term8724, term8724.getClass(), "currentOption", term8737);
        setBooleanField(term8724, term8724.getClass(), "skipParsing", false);
        setField(term8724, term8724.getClass(), "expectedOpts", term8749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "whBvTVIIlC";
        Object retValue = callMethod(klass, "isNegativeNumber", argTypes, term2026, args);
        assertTrue(recursiveEquals(term2026, term8724));
        assertTrue(recursiveEquals(retValue, false));
    }

};


