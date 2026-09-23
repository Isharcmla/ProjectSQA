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
     Object term9172;

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
        LinkedList term9174 = new LinkedList();
        ArrayList term9175 = new ArrayList();
        LinkedHashMap term9178 = new LinkedHashMap();
        LinkedHashMap term9179 = new LinkedHashMap();
        ArrayList term9180 = new ArrayList();
        LinkedHashMap term9182 = new LinkedHashMap();
        ArrayList term9194 = new ArrayList();
        ((ArrayList) term9194).add("");
        ((ArrayList) term9194).add("");
        ArrayList term9198 = new ArrayList();
        term9172 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term9173 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term9177 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9185 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term9173, term9173.getClass(), "args", term9174);
        setField(term9173, term9173.getClass(), "options", term9175);
        setField(term9172, term9172.getClass(), "cmd", term9173);
        setField(term9177, term9177.getClass(), "shortOpts", term9178);
        setField(term9177, term9177.getClass(), "longOpts", term9179);
        setField(term9177, term9177.getClass(), "requiredOpts", term9180);
        setField(term9177, term9177.getClass(), "optionGroups", term9182);
        setField(term9172, term9172.getClass(), "options", term9177);
        setBooleanField(term9172, term9172.getClass(), "stopAtNonOption", true);
        setField(term9172, term9172.getClass(), "currentToken", "xOcJIiQQDu");
        setField(term9185, term9185.getClass(), "opt", "GVizqqzXpy");
        setField(term9185, term9185.getClass(), "longOpt", "JqXGgAhZPl");
        setField(term9185, term9185.getClass(), "argName", "jiKYgYHqIS");
        setField(term9185, term9185.getClass(), "description", "DfISiziTgG");
        setBooleanField(term9185, term9185.getClass(), "required", false);
        setBooleanField(term9185, term9185.getClass(), "optionalArg", false);
        setIntField(term9185, term9185.getClass(), "numberOfArgs", -1339778481);
        setField(term9185, term9185.getClass(), "type", null);
        setField(term9185, term9185.getClass(), "values", term9194);
        setCharField(term9185, term9185.getClass(), "valuesep", 'D');
        setField(term9172, term9172.getClass(), "currentOption", term9185);
        setBooleanField(term9172, term9172.getClass(), "skipParsing", false);
        setField(term9172, term9172.getClass(), "expectedOpts", term9198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XPKmummaqg";
        Object retValue = callMethod(klass, "isNegativeNumber", argTypes, term2082, args);
        assertTrue(recursiveEquals(term2082, term9172));
        assertTrue(recursiveEquals(retValue, false));
    }

};


