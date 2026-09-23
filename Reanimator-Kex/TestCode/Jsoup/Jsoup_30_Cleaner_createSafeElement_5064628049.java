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
     Object term3776;
     Object term3779;
     Object term3710;

    public Cleaner_createSafeElement_5064628049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term924 = new HashMap();
        Set<Object> term3792 =  ((Map) term924).keySet();
        HashSet term923 = new HashSet((Collection<? extends Object>) term3792);
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
        Set<Object> term3803 =  ((Map) term967).keySet();
        HashSet term966 = new HashSet((Collection<? extends Object>) term3803);
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
        term3776 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term3776, term3776.getClass(), "value", "dWRymuLBtr");
        HashMap term3784 = new HashMap();
        Set<Object> term3834 =  ((Map) term3784).keySet();
        HashSet term3783 = new HashSet((Collection<? extends Object>) term3834);
        ArrayList term3785 = new ArrayList();
        ((ArrayList) term3785).add((Object)null);
        LinkedHashMap term3788 = new LinkedHashMap();
        term3779 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3780 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3787 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3780, term3780.getClass(), "tagName", "dWRymuLBtr");
        setBooleanField(term3780, term3780.getClass(), "isBlock", true);
        setBooleanField(term3780, term3780.getClass(), "formatAsBlock", true);
        setBooleanField(term3780, term3780.getClass(), "canContainBlock", true);
        setBooleanField(term3780, term3780.getClass(), "canContainInline", true);
        setBooleanField(term3780, term3780.getClass(), "empty", false);
        setBooleanField(term3780, term3780.getClass(), "selfClosing", false);
        setBooleanField(term3780, term3780.getClass(), "preserveWhitespace", false);
        setField(term3779, term3779.getClass(), "tag", term3780);
        setField(term3779, term3779.getClass(), "classNames", term3783);
        setField(term3779, term3779.getClass(), "parentNode", null);
        setField(term3779, term3779.getClass(), "childNodes", term3785);
        setField(term3787, term3787.getClass(), "attributes", term3788);
        setField(term3779, term3779.getClass(), "attributes", term3787);
        setField(term3779, term3779.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term3779, term3779.getClass(), "siblingIndex", -1955890973);
        ArrayList term3732 = new ArrayList();
        term3710 = newInstance(Class.forName("org.jsoup.safety.Cleaner$ElementMeta"));
        Object term3711 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3712 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3736 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3712, term3712.getClass(), "tagName", "dwrymulbtr");
        setBooleanField(term3712, term3712.getClass(), "isBlock", false);
        setBooleanField(term3712, term3712.getClass(), "formatAsBlock", true);
        setBooleanField(term3712, term3712.getClass(), "canContainBlock", true);
        setBooleanField(term3712, term3712.getClass(), "canContainInline", true);
        setBooleanField(term3712, term3712.getClass(), "empty", false);
        setBooleanField(term3712, term3712.getClass(), "selfClosing", false);
        setBooleanField(term3712, term3712.getClass(), "preserveWhitespace", false);
        setField(term3711, term3711.getClass(), "tag", term3712);
        setField(term3711, term3711.getClass(), "classNames", null);
        setField(term3711, term3711.getClass(), "parentNode", null);
        setField(term3711, term3711.getClass(), "childNodes", term3732);
        setField(term3736, term3736.getClass(), "attributes", null);
        setField(term3711, term3711.getClass(), "attributes", term3736);
        setField(term3711, term3711.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term3711, term3711.getClass(), "siblingIndex", 0);
        setField(term3710, term3710.getClass(), "el", term3711);
        setIntField(term3710, term3710.getClass(), "numAttribsDiscarded", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term945;
        Object retValue = callMethod(klass, "createSafeElement", argTypes, term921, args);
        assertTrue(recursiveEquals(term921, term3776));
        assertTrue(recursiveEquals(term945, term3779));
        assertTrue(recursiveEquals(retValue, term3710));
    }

};


