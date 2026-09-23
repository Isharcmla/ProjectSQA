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

public class DefaultParser_updateRequiredOptions_93193530646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4226;
     Object term4331;
     Object term13408;
     Object term13435;

    public DefaultParser_updateRequiredOptions_93193530646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term4228 = new LinkedList();
        ArrayList term4231 = new ArrayList();
        HashMap term4236 = new HashMap();
        HashMap term4241 = new HashMap();
        ArrayList term4246 = new ArrayList();
        HashMap term4250 = new HashMap();
        ArrayList term4321 = new ArrayList();
        ArrayList term4327 = new ArrayList();
        term4226 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term4227 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term4235 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4268 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4320 = newInstance(Class.forName("java.lang.Object"));
        setField(term4227, term4227.getClass(), "args", term4228);
        setField(term4227, term4227.getClass(), "options", term4231);
        setField(term4226, term4226.getClass(), "cmd", term4227);
        setField(term4235, term4235.getClass(), "shortOpts", term4236);
        setField(term4235, term4235.getClass(), "longOpts", term4241);
        setField(term4235, term4235.getClass(), "requiredOpts", term4246);
        setField(term4235, term4235.getClass(), "optionGroups", term4250);
        setField(term4226, term4226.getClass(), "options", term4235);
        setBooleanField(term4226, term4226.getClass(), "stopAtNonOption", false);
        setField(term4226, term4226.getClass(), "currentToken", "LWyEaeIyAo");
        setField(term4268, term4268.getClass(), "opt", "yVMkkQhvmN");
        setField(term4268, term4268.getClass(), "longOpt", "mvrkADEgpp");
        setField(term4268, term4268.getClass(), "argName", "pXOkjyeIRb");
        setField(term4268, term4268.getClass(), "description", "GgZWSjxjyE");
        setBooleanField(term4268, term4268.getClass(), "required", true);
        setBooleanField(term4268, term4268.getClass(), "optionalArg", true);
        setIntField(term4268, term4268.getClass(), "numberOfArgs", -2068769794);
        setField(term4268, term4268.getClass(), "type", term4320);
        setField(term4268, term4268.getClass(), "values", term4321);
        setCharField(term4268, term4268.getClass(), "valuesep", 'L');
        setField(term4226, term4226.getClass(), "currentOption", term4268);
        setBooleanField(term4226, term4226.getClass(), "skipParsing", true);
        setField(term4226, term4226.getClass(), "expectedOpts", term4327);
        ArrayList term4384 = new ArrayList();
        term4331 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4383 = newInstance(Class.forName("java.lang.Object"));
        setField(term4331, term4331.getClass(), "opt", "EeBVbzjcCI");
        setField(term4331, term4331.getClass(), "longOpt", "UfQtPRyWRC");
        setField(term4331, term4331.getClass(), "argName", "FPvxVzzSvD");
        setField(term4331, term4331.getClass(), "description", "WHcwFgsGFC");
        setBooleanField(term4331, term4331.getClass(), "required", true);
        setBooleanField(term4331, term4331.getClass(), "optionalArg", true);
        setIntField(term4331, term4331.getClass(), "numberOfArgs", -117576464);
        setField(term4331, term4331.getClass(), "type", term4383);
        setField(term4331, term4331.getClass(), "values", term4384);
        setCharField(term4331, term4331.getClass(), "valuesep", 'c');
        LinkedList term13410 = new LinkedList();
        ArrayList term13411 = new ArrayList();
        HashMap term13414 = new HashMap();
        HashMap term13415 = new HashMap();
        ArrayList term13416 = new ArrayList();
        HashMap term13418 = new HashMap();
        ArrayList term13431 = new ArrayList();
        ArrayList term13433 = new ArrayList();
        term13408 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term13409 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term13413 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term13421 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term13430 = newInstance(Class.forName("java.lang.Object"));
        setField(term13409, term13409.getClass(), "args", term13410);
        setField(term13409, term13409.getClass(), "options", term13411);
        setField(term13408, term13408.getClass(), "cmd", term13409);
        setField(term13413, term13413.getClass(), "shortOpts", term13414);
        setField(term13413, term13413.getClass(), "longOpts", term13415);
        setField(term13413, term13413.getClass(), "requiredOpts", term13416);
        setField(term13413, term13413.getClass(), "optionGroups", term13418);
        setField(term13408, term13408.getClass(), "options", term13413);
        setBooleanField(term13408, term13408.getClass(), "stopAtNonOption", false);
        setField(term13408, term13408.getClass(), "currentToken", "LWyEaeIyAo");
        setField(term13421, term13421.getClass(), "opt", "yVMkkQhvmN");
        setField(term13421, term13421.getClass(), "longOpt", "mvrkADEgpp");
        setField(term13421, term13421.getClass(), "argName", "pXOkjyeIRb");
        setField(term13421, term13421.getClass(), "description", "GgZWSjxjyE");
        setBooleanField(term13421, term13421.getClass(), "required", true);
        setBooleanField(term13421, term13421.getClass(), "optionalArg", true);
        setIntField(term13421, term13421.getClass(), "numberOfArgs", -2068769794);
        setField(term13421, term13421.getClass(), "type", term13430);
        setField(term13421, term13421.getClass(), "values", term13431);
        setCharField(term13421, term13421.getClass(), "valuesep", 'L');
        setField(term13408, term13408.getClass(), "currentOption", term13421);
        setBooleanField(term13408, term13408.getClass(), "skipParsing", true);
        setField(term13408, term13408.getClass(), "expectedOpts", term13433);
        ArrayList term13445 = new ArrayList();
        term13435 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term13444 = newInstance(Class.forName("java.lang.Object"));
        setField(term13435, term13435.getClass(), "opt", "EeBVbzjcCI");
        setField(term13435, term13435.getClass(), "longOpt", "UfQtPRyWRC");
        setField(term13435, term13435.getClass(), "argName", "FPvxVzzSvD");
        setField(term13435, term13435.getClass(), "description", "WHcwFgsGFC");
        setBooleanField(term13435, term13435.getClass(), "required", true);
        setBooleanField(term13435, term13435.getClass(), "optionalArg", true);
        setIntField(term13435, term13435.getClass(), "numberOfArgs", -117576464);
        setField(term13435, term13435.getClass(), "type", term13444);
        setField(term13435, term13435.getClass(), "values", term13445);
        setCharField(term13435, term13435.getClass(), "valuesep", 'c');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4331;
        callMethod(klass, "updateRequiredOptions", argTypes, term4226, args);
        assertTrue(recursiveEquals(term4226, term13408));
        assertTrue(recursiveEquals(term4331, term13435));
    }

};


