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

public class DefaultParser_isOption_1083123935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2203;
     Object term8938;

    public DefaultParser_isOption_1083123935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term2205 = new LinkedList();
        ArrayList term2208 = new ArrayList();
        HashMap term2213 = new HashMap();
        HashMap term2218 = new HashMap();
        ArrayList term2223 = new ArrayList();
        HashMap term2227 = new HashMap();
        ArrayList term2298 = new ArrayList();
        ArrayList term2304 = new ArrayList();
        term2203 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term2204 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term2212 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term2245 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2297 = newInstance(Class.forName("java.lang.Object"));
        setField(term2204, term2204.getClass(), "args", term2205);
        setField(term2204, term2204.getClass(), "options", term2208);
        setField(term2203, term2203.getClass(), "cmd", term2204);
        setField(term2212, term2212.getClass(), "shortOpts", term2213);
        setField(term2212, term2212.getClass(), "longOpts", term2218);
        setField(term2212, term2212.getClass(), "requiredOpts", term2223);
        setField(term2212, term2212.getClass(), "optionGroups", term2227);
        setField(term2203, term2203.getClass(), "options", term2212);
        setBooleanField(term2203, term2203.getClass(), "stopAtNonOption", true);
        setField(term2203, term2203.getClass(), "currentToken", "IgRJUzaCwW");
        setField(term2245, term2245.getClass(), "opt", "JUmudUmaaV");
        setField(term2245, term2245.getClass(), "longOpt", "KoyGrUJeJW");
        setField(term2245, term2245.getClass(), "argName", "HqBOwkVqjD");
        setField(term2245, term2245.getClass(), "description", "MAcUBcBckh");
        setBooleanField(term2245, term2245.getClass(), "required", true);
        setBooleanField(term2245, term2245.getClass(), "optionalArg", false);
        setIntField(term2245, term2245.getClass(), "numberOfArgs", 1725571209);
        setField(term2245, term2245.getClass(), "type", term2297);
        setField(term2245, term2245.getClass(), "values", term2298);
        setCharField(term2245, term2245.getClass(), "valuesep", 's');
        setField(term2203, term2203.getClass(), "currentOption", term2245);
        setBooleanField(term2203, term2203.getClass(), "skipParsing", true);
        setField(term2203, term2203.getClass(), "expectedOpts", term2304);
        LinkedList term8940 = new LinkedList();
        ArrayList term8941 = new ArrayList();
        HashMap term8944 = new HashMap();
        HashMap term8945 = new HashMap();
        ArrayList term8946 = new ArrayList();
        HashMap term8948 = new HashMap();
        ArrayList term8961 = new ArrayList();
        ArrayList term8963 = new ArrayList();
        term8938 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term8939 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term8943 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term8951 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term8960 = newInstance(Class.forName("java.lang.Object"));
        setField(term8939, term8939.getClass(), "args", term8940);
        setField(term8939, term8939.getClass(), "options", term8941);
        setField(term8938, term8938.getClass(), "cmd", term8939);
        setField(term8943, term8943.getClass(), "shortOpts", term8944);
        setField(term8943, term8943.getClass(), "longOpts", term8945);
        setField(term8943, term8943.getClass(), "requiredOpts", term8946);
        setField(term8943, term8943.getClass(), "optionGroups", term8948);
        setField(term8938, term8938.getClass(), "options", term8943);
        setBooleanField(term8938, term8938.getClass(), "stopAtNonOption", true);
        setField(term8938, term8938.getClass(), "currentToken", "IgRJUzaCwW");
        setField(term8951, term8951.getClass(), "opt", "JUmudUmaaV");
        setField(term8951, term8951.getClass(), "longOpt", "KoyGrUJeJW");
        setField(term8951, term8951.getClass(), "argName", "HqBOwkVqjD");
        setField(term8951, term8951.getClass(), "description", "MAcUBcBckh");
        setBooleanField(term8951, term8951.getClass(), "required", true);
        setBooleanField(term8951, term8951.getClass(), "optionalArg", false);
        setIntField(term8951, term8951.getClass(), "numberOfArgs", 1725571209);
        setField(term8951, term8951.getClass(), "type", term8960);
        setField(term8951, term8951.getClass(), "values", term8961);
        setCharField(term8951, term8951.getClass(), "valuesep", 's');
        setField(term8938, term8938.getClass(), "currentOption", term8951);
        setBooleanField(term8938, term8938.getClass(), "skipParsing", true);
        setField(term8938, term8938.getClass(), "expectedOpts", term8963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        Object retValue = callMethod(klass, "isOption", argTypes, term2203, args);
        assertTrue(recursiveEquals(term2203, term8938));
        assertTrue(recursiveEquals(retValue, false));
    }

};


