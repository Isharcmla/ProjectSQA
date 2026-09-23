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

public class Whitelist_addProtocols_110721250225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;
     Object term434;
     Object term12464;
     Object term12471;
     Object term12432;

    public Whitelist_addProtocols_110721250225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term389 = new HashMap();
        Set<Object> term12478 =  ((Map) term389).keySet();
        HashSet term388 = new HashSet((Collection<? extends Object>) term12478);
        HashMap term394 = new HashMap();
        HashMap term399 = new HashMap();
        HashMap term404 = new HashMap();
        term387 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term387, term387.getClass(), "tagNames", term388);
        setField(term387, term387.getClass(), "attributes", term394);
        setField(term387, term387.getClass(), "enforcedAttributes", term399);
        setField(term387, term387.getClass(), "protocols", term404);
        setBooleanField(term387, term387.getClass(), "preserveRelativeLinks", true);
        term434 = (Object[]) newArray("java.lang.String", 3);
        setElement(term434, 0, "aJlieCFVtF");
        setElement(term434, 1, "ZiaGIbnzTs");
        setElement(term434, 2, "tbcdzjIfER");
        term12464 = newInstance(Class.forName("org.jsoup.safety.Whitelist$Protocol"));
        setField(term12464, term12464.getClass(), "value", "tbcdzjIfER");
        term12471 = (Object[]) newArray("java.lang.String", 3);
        setElement(term12471, 0, "aJlieCFVtF");
        setElement(term12471, 1, "ZiaGIbnzTs");
        setElement(term12471, 2, "tbcdzjIfER");
        HashMap term12434 = new HashMap();
        Set<Object> term12589 =  ((Map) term12434).keySet();
        HashSet term12433 = new HashSet((Collection<? extends Object>) term12589);
        HashMap term12439 = new HashMap();
        HashMap term12444 = new HashMap();
        HashMap term12449 = new HashMap();
        term12432 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term12432, term12432.getClass(), "tagNames", term12433);
        setField(term12432, term12432.getClass(), "attributes", term12439);
        setField(term12432, term12432.getClass(), "enforcedAttributes", term12444);
        setField(term12432, term12432.getClass(), "protocols", term12449);
        setBooleanField(term12432, term12432.getClass(), "preserveRelativeLinks", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Whitelist");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "LQFpaHEwXR";
        args[1] = "oVcInYnLWB";
        args[2] = term434;
        Object retValue = callMethod(klass, "addProtocols", argTypes, term387, args);
        assertTrue(recursiveEquals(term387, term12464));
        assertTrue(recursiveEquals(term434, term12471));
        assertTrue(recursiveEquals(retValue, term12432));
    }

};


