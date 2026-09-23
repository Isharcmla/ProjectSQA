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

public class DefaultParser_checkRequiredArgs_200729206731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1560;
     Object term8051;

    public DefaultParser_checkRequiredArgs_200729206731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term1562 = new LinkedList();
        ArrayList term1565 = new ArrayList();
        LinkedHashMap term1570 = new LinkedHashMap();
        LinkedHashMap term1576 = new LinkedHashMap();
        ArrayList term1582 = new ArrayList();
        LinkedHashMap term1586 = new LinkedHashMap();
        ArrayList term1657 = new ArrayList();
        ((ArrayList) term1657).add("");
        ((ArrayList) term1657).add("");
        ((ArrayList) term1657).add("");
        ((ArrayList) term1657).add("");
        ArrayList term1667 = new ArrayList();
        term1560 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term1561 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term1569 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term1605 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1561, term1561.getClass(), "args", term1562);
        setField(term1561, term1561.getClass(), "options", term1565);
        setField(term1560, term1560.getClass(), "cmd", term1561);
        setField(term1569, term1569.getClass(), "shortOpts", term1570);
        setField(term1569, term1569.getClass(), "longOpts", term1576);
        setField(term1569, term1569.getClass(), "requiredOpts", term1582);
        setField(term1569, term1569.getClass(), "optionGroups", term1586);
        setField(term1560, term1560.getClass(), "options", term1569);
        setBooleanField(term1560, term1560.getClass(), "stopAtNonOption", false);
        setField(term1560, term1560.getClass(), "currentToken", "TJmVBGfTML");
        setField(term1605, term1605.getClass(), "opt", "tPlsykYBqO");
        setField(term1605, term1605.getClass(), "longOpt", "bLPjGVBhlX");
        setField(term1605, term1605.getClass(), "argName", "whBvTVIIlC");
        setField(term1605, term1605.getClass(), "description", "IgRJUzaCwW");
        setBooleanField(term1605, term1605.getClass(), "required", false);
        setBooleanField(term1605, term1605.getClass(), "optionalArg", true);
        setIntField(term1605, term1605.getClass(), "numberOfArgs", -1955890973);
        setField(term1605, term1605.getClass(), "type", null);
        setField(term1605, term1605.getClass(), "values", term1657);
        setCharField(term1605, term1605.getClass(), "valuesep", 'Z');
        setField(term1560, term1560.getClass(), "currentOption", term1605);
        setBooleanField(term1560, term1560.getClass(), "skipParsing", true);
        setField(term1560, term1560.getClass(), "expectedOpts", term1667);
        LinkedList term8053 = new LinkedList();
        ArrayList term8054 = new ArrayList();
        LinkedHashMap term8057 = new LinkedHashMap();
        LinkedHashMap term8058 = new LinkedHashMap();
        ArrayList term8059 = new ArrayList();
        LinkedHashMap term8061 = new LinkedHashMap();
        ArrayList term8073 = new ArrayList();
        ((ArrayList) term8073).add("");
        ((ArrayList) term8073).add("");
        ((ArrayList) term8073).add("");
        ((ArrayList) term8073).add("");
        ArrayList term8079 = new ArrayList();
        term8051 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term8052 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term8056 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term8064 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8052, term8052.getClass(), "args", term8053);
        setField(term8052, term8052.getClass(), "options", term8054);
        setField(term8051, term8051.getClass(), "cmd", term8052);
        setField(term8056, term8056.getClass(), "shortOpts", term8057);
        setField(term8056, term8056.getClass(), "longOpts", term8058);
        setField(term8056, term8056.getClass(), "requiredOpts", term8059);
        setField(term8056, term8056.getClass(), "optionGroups", term8061);
        setField(term8051, term8051.getClass(), "options", term8056);
        setBooleanField(term8051, term8051.getClass(), "stopAtNonOption", false);
        setField(term8051, term8051.getClass(), "currentToken", "TJmVBGfTML");
        setField(term8064, term8064.getClass(), "opt", "tPlsykYBqO");
        setField(term8064, term8064.getClass(), "longOpt", "bLPjGVBhlX");
        setField(term8064, term8064.getClass(), "argName", "whBvTVIIlC");
        setField(term8064, term8064.getClass(), "description", "IgRJUzaCwW");
        setBooleanField(term8064, term8064.getClass(), "required", false);
        setBooleanField(term8064, term8064.getClass(), "optionalArg", true);
        setIntField(term8064, term8064.getClass(), "numberOfArgs", -1955890973);
        setField(term8064, term8064.getClass(), "type", null);
        setField(term8064, term8064.getClass(), "values", term8073);
        setCharField(term8064, term8064.getClass(), "valuesep", 'Z');
        setField(term8051, term8051.getClass(), "currentOption", term8064);
        setBooleanField(term8051, term8051.getClass(), "skipParsing", true);
        setField(term8051, term8051.getClass(), "expectedOpts", term8079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkRequiredArgs", argTypes, term1560, args);
        assertTrue(recursiveEquals(term1560, term8051));
    }

};


