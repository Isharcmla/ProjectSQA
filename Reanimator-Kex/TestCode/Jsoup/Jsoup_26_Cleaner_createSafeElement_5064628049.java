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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Cleaner_createSafeElement_5064628049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term921;
     Object term945;
     Object term3773;
     Object term3776;
     Object term3707;

    public Cleaner_createSafeElement_5064628049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term924 = new HashMap();
        Set<Object> term3789 =  ((Map) term924).keySet();
        HashSet term923 = new HashSet((Collection<? extends Object>) term3789);
        HashMap term929 = new HashMap();
        HashMap term934 = new HashMap();
        HashMap term939 = new HashMap();
        term921 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term922 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term922, term922.getClass(), "tagNames", term923);
        setField(term922, term922.getClass(), "attributes", term929);
        setField(term922, term922.getClass(), "enforcedAttributes", term934);
        setField(term922, term922.getClass(), "protocols", term939);
        setBooleanField(term922, term922.getClass(), "preserveRelativeLinks", false);
        setField(term921, term921.getClass(), "whitelist", term922);
        HashMap term967 = new HashMap();
        Set<Object> term3800 =  ((Map) term967).keySet();
        HashSet term966 = new HashSet((Collection<? extends Object>) term3800);
        ArrayList term985 = new ArrayList();
        ((ArrayList) term985).add((Object)null);
        LinkedHashMap term990 = new LinkedHashMap();
        term945 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term946 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term989 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term946, term946.getClass(), "tagName", "dWRymuLBtr");
        setBooleanField(term946, term946.getClass(), "isBlock", true);
        setBooleanField(term946, term946.getClass(), "formatAsBlock", true);
        setBooleanField(term946, term946.getClass(), "canContainBlock", true);
        setBooleanField(term946, term946.getClass(), "canContainInline", true);
        setBooleanField(term946, term946.getClass(), "empty", false);
        setBooleanField(term946, term946.getClass(), "selfClosing", false);
        setBooleanField(term946, term946.getClass(), "preserveWhitespace", false);
        setField(term945, term945.getClass(), "tag", term946);
        setField(term945, term945.getClass(), "classNames", term966);
        setField(term945, term945.getClass(), "parentNode", null);
        setField(term945, term945.getClass(), "childNodes", term985);
        setField(term989, term989.getClass(), "attributes", term990);
        setField(term945, term945.getClass(), "attributes", term989);
        setField(term945, term945.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term945, term945.getClass(), "siblingIndex", -1955890973);
        term3773 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term3773, term3773.getClass(), "value", "dWRymuLBtr");
        HashMap term3781 = new HashMap();
        Set<Object> term3831 =  ((Map) term3781).keySet();
        HashSet term3780 = new HashSet((Collection<? extends Object>) term3831);
        ArrayList term3782 = new ArrayList();
        ((ArrayList) term3782).add((Object)null);
        LinkedHashMap term3785 = new LinkedHashMap();
        term3776 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3777 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3784 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3777, term3777.getClass(), "tagName", "dWRymuLBtr");
        setBooleanField(term3777, term3777.getClass(), "isBlock", true);
        setBooleanField(term3777, term3777.getClass(), "formatAsBlock", true);
        setBooleanField(term3777, term3777.getClass(), "canContainBlock", true);
        setBooleanField(term3777, term3777.getClass(), "canContainInline", true);
        setBooleanField(term3777, term3777.getClass(), "empty", false);
        setBooleanField(term3777, term3777.getClass(), "selfClosing", false);
        setBooleanField(term3777, term3777.getClass(), "preserveWhitespace", false);
        setField(term3776, term3776.getClass(), "tag", term3777);
        setField(term3776, term3776.getClass(), "classNames", term3780);
        setField(term3776, term3776.getClass(), "parentNode", null);
        setField(term3776, term3776.getClass(), "childNodes", term3782);
        setField(term3784, term3784.getClass(), "attributes", term3785);
        setField(term3776, term3776.getClass(), "attributes", term3784);
        setField(term3776, term3776.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term3776, term3776.getClass(), "siblingIndex", -1955890973);
        ArrayList term3729 = new ArrayList();
        term3707 = newInstance(Class.forName("org.jsoup.safety.Cleaner$ElementMeta"));
        Object term3708 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3709 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3733 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3709, term3709.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term3709, term3709.getClass(), "isBlock", false);
        setBooleanField(term3709, term3709.getClass(), "formatAsBlock", true);
        setBooleanField(term3709, term3709.getClass(), "canContainBlock", true);
        setBooleanField(term3709, term3709.getClass(), "canContainInline", true);
        setBooleanField(term3709, term3709.getClass(), "empty", false);
        setBooleanField(term3709, term3709.getClass(), "selfClosing", false);
        setBooleanField(term3709, term3709.getClass(), "preserveWhitespace", false);
        setField(term3708, term3708.getClass(), "tag", term3709);
        setField(term3708, term3708.getClass(), "classNames", null);
        setField(term3708, term3708.getClass(), "parentNode", null);
        setField(term3708, term3708.getClass(), "childNodes", term3729);
        setField(term3733, term3733.getClass(), "attributes", null);
        setField(term3708, term3708.getClass(), "attributes", term3733);
        setField(term3708, term3708.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term3708, term3708.getClass(), "siblingIndex", 0);
        setField(term3707, term3707.getClass(), "el", term3708);
        setIntField(term3707, term3707.getClass(), "numAttribsDiscarded", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term945;
        Object retValue = callMethod(klass, "createSafeElement", argTypes, term921, args);
        assertTrue(recursiveEquals(term921, term3773));
        assertTrue(recursiveEquals(term945, term3776));
        assertTrue(recursiveEquals(retValue, term3707));
    }

};


