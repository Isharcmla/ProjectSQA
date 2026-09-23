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

public class DefaultParser_handleOption_129848403545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3973;
     Object term4078;
     Object term13028;
     Object term13044;

    public DefaultParser_handleOption_129848403545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3975 = new LinkedList();
        ArrayList term3978 = new ArrayList();
        HashMap term3983 = new HashMap();
        HashMap term3988 = new HashMap();
        ArrayList term3993 = new ArrayList();
        HashMap term3997 = new HashMap();
        ArrayList term4068 = new ArrayList();
        ArrayList term4074 = new ArrayList();
        term3973 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3974 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3982 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4015 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4067 = newInstance(Class.forName("java.lang.Object"));
        setField(term3974, term3974.getClass(), "args", term3975);
        setField(term3974, term3974.getClass(), "options", term3978);
        setField(term3973, term3973.getClass(), "cmd", term3974);
        setField(term3982, term3982.getClass(), "shortOpts", term3983);
        setField(term3982, term3982.getClass(), "longOpts", term3988);
        setField(term3982, term3982.getClass(), "requiredOpts", term3993);
        setField(term3982, term3982.getClass(), "optionGroups", term3997);
        setField(term3973, term3973.getClass(), "options", term3982);
        setBooleanField(term3973, term3973.getClass(), "stopAtNonOption", true);
        setField(term3973, term3973.getClass(), "currentToken", "AKNapTAfmD");
        setField(term4015, term4015.getClass(), "opt", "xJgPlLxpgC");
        setField(term4015, term4015.getClass(), "longOpt", "EYtfuJaxiM");
        setField(term4015, term4015.getClass(), "argName", "gCWtLVKVVe");
        setField(term4015, term4015.getClass(), "description", "fWKJoSoCwE");
        setBooleanField(term4015, term4015.getClass(), "required", false);
        setBooleanField(term4015, term4015.getClass(), "optionalArg", true);
        setIntField(term4015, term4015.getClass(), "numberOfArgs", -655067527);
        setField(term4015, term4015.getClass(), "type", term4067);
        setField(term4015, term4015.getClass(), "values", term4068);
        setCharField(term4015, term4015.getClass(), "valuesep", 'M');
        setField(term3973, term3973.getClass(), "currentOption", term4015);
        setBooleanField(term3973, term3973.getClass(), "skipParsing", false);
        setField(term3973, term3973.getClass(), "expectedOpts", term4074);
        ArrayList term4131 = new ArrayList();
        term4078 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4130 = newInstance(Class.forName("java.lang.Object"));
        setField(term4078, term4078.getClass(), "opt", "wfaXBpWAUH");
        setField(term4078, term4078.getClass(), "longOpt", "VMeAzAHwZj");
        setField(term4078, term4078.getClass(), "argName", "PznxWXsZME");
        setField(term4078, term4078.getClass(), "description", "ZzIujlwVsw");
        setBooleanField(term4078, term4078.getClass(), "required", true);
        setBooleanField(term4078, term4078.getClass(), "optionalArg", false);
        setIntField(term4078, term4078.getClass(), "numberOfArgs", -6029667);
        setField(term4078, term4078.getClass(), "type", term4130);
        setField(term4078, term4078.getClass(), "values", term4131);
        setCharField(term4078, term4078.getClass(), "valuesep", 'u');
        LinkedList term13030 = new LinkedList();
        Object term13033 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term13033, term13033.getClass(), "opt", null);
        setField(term13033, term13033.getClass(), "longOpt", null);
        setField(term13033, term13033.getClass(), "argName", null);
        setField(term13033, term13033.getClass(), "description", null);
        setBooleanField(term13033, term13033.getClass(), "required", true);
        setBooleanField(term13033, term13033.getClass(), "optionalArg", false);
        setIntField(term13033, term13033.getClass(), "numberOfArgs", -6029667);
        setField(term13033, term13033.getClass(), "type", null);
        setField(term13033, term13033.getClass(), "values", null);
        setCharField(term13033, term13033.getClass(), "valuesep", 'u');
        ArrayList term13031 = new ArrayList();
        ((ArrayList) term13031).add(term13033);
        HashMap term13035 = new HashMap();
        HashMap term13036 = new HashMap();
        ArrayList term13037 = new ArrayList();
        HashMap term13039 = new HashMap();
        ArrayList term13042 = new ArrayList();
        term13028 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term13029 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term13034 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term13029, term13029.getClass(), "args", term13030);
        setField(term13029, term13029.getClass(), "options", term13031);
        setField(term13028, term13028.getClass(), "cmd", term13029);
        setField(term13034, term13034.getClass(), "shortOpts", term13035);
        setField(term13034, term13034.getClass(), "longOpts", term13036);
        setField(term13034, term13034.getClass(), "requiredOpts", term13037);
        setField(term13034, term13034.getClass(), "optionGroups", term13039);
        setField(term13028, term13028.getClass(), "options", term13034);
        setBooleanField(term13028, term13028.getClass(), "stopAtNonOption", true);
        setField(term13028, term13028.getClass(), "currentToken", "AKNapTAfmD");
        setField(term13028, term13028.getClass(), "currentOption", null);
        setBooleanField(term13028, term13028.getClass(), "skipParsing", false);
        setField(term13028, term13028.getClass(), "expectedOpts", term13042);
        ArrayList term13054 = new ArrayList();
        term13044 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term13053 = newInstance(Class.forName("java.lang.Object"));
        setField(term13044, term13044.getClass(), "opt", "wfaXBpWAUH");
        setField(term13044, term13044.getClass(), "longOpt", "VMeAzAHwZj");
        setField(term13044, term13044.getClass(), "argName", "PznxWXsZME");
        setField(term13044, term13044.getClass(), "description", "ZzIujlwVsw");
        setBooleanField(term13044, term13044.getClass(), "required", true);
        setBooleanField(term13044, term13044.getClass(), "optionalArg", false);
        setIntField(term13044, term13044.getClass(), "numberOfArgs", -6029667);
        setField(term13044, term13044.getClass(), "type", term13053);
        setField(term13044, term13044.getClass(), "values", term13054);
        setCharField(term13044, term13044.getClass(), "valuesep", 'u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term4078;
        callMethod(klass, "handleOption", argTypes, term3973, args);
        assertTrue(recursiveEquals(term3973, term13028));
        assertTrue(recursiveEquals(term4078, term13044));
    }

};


