package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Element_doSetBaseUri_421920239115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;
     Object term10238;

    public Element_doSetBaseUri_421920239115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term427 = new ArrayList();
        ((ArrayList) term427).add((Object)null);
        term401 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term423 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term424 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term425 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term431 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term433 = (Object[]) newArray("java.lang.String", 0);
        Object[] term434 = (Object[]) newArray("java.lang.String", 0);
        setField(term402, term402.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term402, term402.getClass(), "isBlock", true);
        setBooleanField(term402, term402.getClass(), "formatAsBlock", false);
        setBooleanField(term402, term402.getClass(), "canContainInline", false);
        setBooleanField(term402, term402.getClass(), "empty", true);
        setBooleanField(term402, term402.getClass(), "selfClosing", false);
        setBooleanField(term402, term402.getClass(), "preserveWhitespace", true);
        setBooleanField(term402, term402.getClass(), "formList", false);
        setBooleanField(term402, term402.getClass(), "formSubmit", false);
        setField(term401, term401.getClass(), "tag", term402);
        setField(term423, term423.getClass(), "referent", null);
        setField(term424, term424.getClass(), "lock", term425);
        setField(term424, term424.getClass(), "head", null);
        setLongField(term424, term424.getClass(), "queueLength", 5270370404989704783L);
        setField(term423, term423.getClass(), "queue", term424);
        setField(term423, term423.getClass(), "next", null);
        setField(term423, term423.getClass(), "discovered", null);
        setField(term401, term401.getClass(), "shadowChildrenRef", term423);
        setField(term401, term401.getClass(), "childNodes", term427);
        setIntField(term431, term431.getClass(), "size", -1339778481);
        setField(term431, term431.getClass(), "keys", term433);
        setField(term431, term431.getClass(), "vals", term434);
        setField(term401, term401.getClass(), "attributes", term431);
        setField(term401, term401.getClass(), "baseUri", "oVcInYnLWB");
        setField(term401, term401.getClass(), "parentNode", null);
        setIntField(term401, term401.getClass(), "siblingIndex", 1725571209);
        ArrayList term10245 = new ArrayList();
        ((ArrayList) term10245).add((Object)null);
        term10238 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10239 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10242 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10243 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10244 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10247 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10248 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10249 = (Object[]) newArray("java.lang.String", 0);
        setField(term10239, term10239.getClass(), "tagName", "LQFpaHEwXR");
        setBooleanField(term10239, term10239.getClass(), "isBlock", true);
        setBooleanField(term10239, term10239.getClass(), "formatAsBlock", false);
        setBooleanField(term10239, term10239.getClass(), "canContainInline", false);
        setBooleanField(term10239, term10239.getClass(), "empty", true);
        setBooleanField(term10239, term10239.getClass(), "selfClosing", false);
        setBooleanField(term10239, term10239.getClass(), "preserveWhitespace", true);
        setBooleanField(term10239, term10239.getClass(), "formList", false);
        setBooleanField(term10239, term10239.getClass(), "formSubmit", false);
        setField(term10238, term10238.getClass(), "tag", term10239);
        setField(term10242, term10242.getClass(), "referent", null);
        setField(term10243, term10243.getClass(), "lock", term10244);
        setField(term10243, term10243.getClass(), "head", null);
        setLongField(term10243, term10243.getClass(), "queueLength", 5270370404989704783L);
        setField(term10242, term10242.getClass(), "queue", term10243);
        setField(term10242, term10242.getClass(), "next", null);
        setField(term10242, term10242.getClass(), "discovered", null);
        setField(term10238, term10238.getClass(), "shadowChildrenRef", term10242);
        setField(term10238, term10238.getClass(), "childNodes", term10245);
        setIntField(term10247, term10247.getClass(), "size", -1339778481);
        setField(term10247, term10247.getClass(), "keys", term10248);
        setField(term10247, term10247.getClass(), "vals", term10249);
        setField(term10238, term10238.getClass(), "attributes", term10247);
        setField(term10238, term10238.getClass(), "baseUri", "aJlieCFVtF");
        setField(term10238, term10238.getClass(), "parentNode", null);
        setIntField(term10238, term10238.getClass(), "siblingIndex", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "doSetBaseUri", argTypes, term401, args);
        assertTrue(recursiveEquals(term401, term10238));
    }

};


