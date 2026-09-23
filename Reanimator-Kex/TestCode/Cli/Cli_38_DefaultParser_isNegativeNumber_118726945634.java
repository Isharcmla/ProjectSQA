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

public class DefaultParser_isNegativeNumber_118726945634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2082;
     Object term9162;

    public DefaultParser_isNegativeNumber_118726945634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2084 = new LinkedList();
        ArrayList term2087 = new ArrayList();
        LinkedHashMap term2092 = new LinkedHashMap();
        LinkedHashMap term2098 = new LinkedHashMap();
        ArrayList term2104 = new ArrayList();
        LinkedHashMap term2108 = new LinkedHashMap();
        ArrayList term2179 = new ArrayList();
        ((ArrayList) term2179).add("");
        ((ArrayList) term2179).add("");
        ArrayList term2187 = new ArrayList();
        term2082 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2083 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2091 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2127 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2083, term2083.getClass(), "args", term2084);
        setField(term2083, term2083.getClass(), "options", term2087);
        setField(term2082, term2082.getClass(), "cmd", term2083);
        setField(term2091, term2091.getClass(), "shortOpts", term2092);
        setField(term2091, term2091.getClass(), "longOpts", term2098);
        setField(term2091, term2091.getClass(), "requiredOpts", term2104);
        setField(term2091, term2091.getClass(), "optionGroups", term2108);
        setField(term2082, term2082.getClass(), "options", term2091);
        setBooleanField(term2082, term2082.getClass(), "stopAtNonOption", true);
        setField(term2082, term2082.getClass(), "currentToken", "xOcJIiQQDu");
        setField(term2127, term2127.getClass(), "opt", "GVizqqzXpy");
        setField(term2127, term2127.getClass(), "longOpt", "JqXGgAhZPl");
        setField(term2127, term2127.getClass(), "argName", "jiKYgYHqIS");
        setField(term2127, term2127.getClass(), "description", "DfISiziTgG");
        setBooleanField(term2127, term2127.getClass(), "required", false);
        setBooleanField(term2127, term2127.getClass(), "optionalArg", false);
        setIntField(term2127, term2127.getClass(), "numberOfArgs", -1339778481);
        setField(term2127, term2127.getClass(), "type", null);
        setField(term2127, term2127.getClass(), "values", term2179);
        setCharField(term2127, term2127.getClass(), "valuesep", 'D');
        setField(term2082, term2082.getClass(), "currentOption", term2127);
        setBooleanField(term2082, term2082.getClass(), "skipParsing", false);
        setField(term2082, term2082.getClass(), "expectedOpts", term2187);
        LinkedList term9164 = new LinkedList();
        ArrayList term9165 = new ArrayList();
        LinkedHashMap term9168 = new LinkedHashMap();
        LinkedHashMap term9169 = new LinkedHashMap();
        ArrayList term9170 = new ArrayList();
        LinkedHashMap term9172 = new LinkedHashMap();
        ArrayList term9184 = new ArrayList();
        ((ArrayList) term9184).add("");
        ((ArrayList) term9184).add("");
        ArrayList term9188 = new ArrayList();
        term9162 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term9163 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term9167 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9175 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term9163, term9163.getClass(), "args", term9164);
        setField(term9163, term9163.getClass(), "options", term9165);
        setField(term9162, term9162.getClass(), "cmd", term9163);
        setField(term9167, term9167.getClass(), "shortOpts", term9168);
        setField(term9167, term9167.getClass(), "longOpts", term9169);
        setField(term9167, term9167.getClass(), "requiredOpts", term9170);
        setField(term9167, term9167.getClass(), "optionGroups", term9172);
        setField(term9162, term9162.getClass(), "options", term9167);
        setBooleanField(term9162, term9162.getClass(), "stopAtNonOption", true);
        setField(term9162, term9162.getClass(), "currentToken", "xOcJIiQQDu");
        setField(term9175, term9175.getClass(), "opt", "GVizqqzXpy");
        setField(term9175, term9175.getClass(), "longOpt", "JqXGgAhZPl");
        setField(term9175, term9175.getClass(), "argName", "jiKYgYHqIS");
        setField(term9175, term9175.getClass(), "description", "DfISiziTgG");
        setBooleanField(term9175, term9175.getClass(), "required", false);
        setBooleanField(term9175, term9175.getClass(), "optionalArg", false);
        setIntField(term9175, term9175.getClass(), "numberOfArgs", -1339778481);
        setField(term9175, term9175.getClass(), "type", null);
        setField(term9175, term9175.getClass(), "values", term9184);
        setCharField(term9175, term9175.getClass(), "valuesep", 'D');
        setField(term9162, term9162.getClass(), "currentOption", term9175);
        setBooleanField(term9162, term9162.getClass(), "skipParsing", false);
        setField(term9162, term9162.getClass(), "expectedOpts", term9188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        Object retValue = callMethod(klass, "isNegativeNumber", argTypes, term2082, args);
        assertTrue(recursiveEquals(term2082, term9162));
        assertTrue(recursiveEquals(retValue, false));
    }

};


