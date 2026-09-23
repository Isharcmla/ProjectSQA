package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class Whitelist_preserveRelativeLinks_213932576224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361;
     Object term384;
     Object term12219;
     Object term12195;

    public Whitelist_preserveRelativeLinks_213932576224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term363 = new HashMap();
        Set<Object> term12225 =  ((Map) term363).keySet();
        HashSet term362 = new HashSet((Collection<? extends Object>) term12225);
        HashMap term368 = new HashMap();
        HashMap term373 = new HashMap();
        HashMap term378 = new HashMap();
        term361 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term361, term361.getClass(), "tagNames", term362);
        setField(term361, term361.getClass(), "attributes", term368);
        setField(term361, term361.getClass(), "enforcedAttributes", term373);
        setField(term361, term361.getClass(), "protocols", term378);
        setBooleanField(term361, term361.getClass(), "preserveRelativeLinks", false);
        term384 = new Boolean(true);
        HashMap term12221 = new HashMap();
        Set<Object> term12226 =  ((Map) term12221).keySet();
        HashSet term12220 = new HashSet((Collection<? extends Object>) term12226);
        HashMap term12222 = new HashMap();
        HashMap term12223 = new HashMap();
        HashMap term12224 = new HashMap();
        term12219 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term12219, term12219.getClass(), "tagNames", term12220);
        setField(term12219, term12219.getClass(), "attributes", term12222);
        setField(term12219, term12219.getClass(), "enforcedAttributes", term12223);
        setField(term12219, term12219.getClass(), "protocols", term12224);
        setBooleanField(term12219, term12219.getClass(), "preserveRelativeLinks", true);
        HashMap term12197 = new HashMap();
        Set<Object> term12227 =  ((Map) term12197).keySet();
        HashSet term12196 = new HashSet((Collection<? extends Object>) term12227);
        HashMap term12202 = new HashMap();
        HashMap term12207 = new HashMap();
        HashMap term12212 = new HashMap();
        term12195 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term12195, term12195.getClass(), "tagNames", term12196);
        setField(term12195, term12195.getClass(), "attributes", term12202);
        setField(term12195, term12195.getClass(), "enforcedAttributes", term12207);
        setField(term12195, term12195.getClass(), "protocols", term12212);
        setBooleanField(term12195, term12195.getClass(), "preserveRelativeLinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term384;
        Object retValue = callMethod(klass, "preserveRelativeLinks", argTypes, term361, args);
        assertTrue(recursiveEquals(term361, term12219));
        assertTrue(recursiveEquals(term384, true));
        assertTrue(recursiveEquals(retValue, term12195));
    }

};


