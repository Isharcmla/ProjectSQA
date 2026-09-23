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

public class Whitelist_addEnforcedAttribute_89110149323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term12114;
     Object term12082;

    public Whitelist_addEnforcedAttribute_89110149323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term273 = new HashMap();
        Set<Object> term12123 =  ((Map) term273).keySet();
        HashSet term272 = new HashSet((Collection<? extends Object>) term12123);
        HashMap term278 = new HashMap();
        HashMap term283 = new HashMap();
        HashMap term288 = new HashMap();
        term271 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term271, term271.getClass(), "tagNames", term272);
        setField(term271, term271.getClass(), "attributes", term278);
        setField(term271, term271.getClass(), "enforcedAttributes", term283);
        setField(term271, term271.getClass(), "protocols", term288);
        setBooleanField(term271, term271.getClass(), "preserveRelativeLinks", false);
        term12114 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term12114, term12114.getClass(), "value", "NRdvgJlhkX");
        HashMap term12084 = new HashMap();
        Set<Object> term12194 =  ((Map) term12084).keySet();
        HashSet term12083 = new HashSet((Collection<? extends Object>) term12194);
        HashMap term12089 = new HashMap();
        HashMap term12094 = new HashMap();
        HashMap term12108 = new HashMap();
        term12082 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term12082, term12082.getClass(), "tagNames", term12083);
        setField(term12082, term12082.getClass(), "attributes", term12089);
        setField(term12082, term12082.getClass(), "enforcedAttributes", term12094);
        setField(term12082, term12082.getClass(), "protocols", term12108);
        setBooleanField(term12082, term12082.getClass(), "preserveRelativeLinks", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "NRdvgJlhkX";
        args[1] = "uuaPigETmJ";
        args[2] = "MxlszYVzRf";
        Object retValue = callMethod(klass, "addEnforcedAttribute", argTypes, term271, args);
        assertTrue(recursiveEquals(term271, term12114));
        assertTrue(recursiveEquals(retValue, term12082));
    }

};


