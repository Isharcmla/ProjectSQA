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
import java.lang.Object;
import java.util.ArrayList;

public class Element_html_1078401270101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8753;

    public Element_html_1078401270101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8779 = new ArrayList();
        ((ArrayList) term8779).add((Object)null);
        ((ArrayList) term8779).add((Object)null);
        ((ArrayList) term8779).add((Object)null);
        term8753 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8754 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8775 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term8776 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term8777 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term8783 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8785 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8786 = (Object[]) newArray("java.lang.String", 0);
        setField(term8754, term8754.getClass(), "tagName", "NTlKJDDWlk");
        setBooleanField(term8754, term8754.getClass(), "isBlock", true);
        setBooleanField(term8754, term8754.getClass(), "formatAsBlock", false);
        setBooleanField(term8754, term8754.getClass(), "canContainInline", false);
        setBooleanField(term8754, term8754.getClass(), "empty", false);
        setBooleanField(term8754, term8754.getClass(), "selfClosing", false);
        setBooleanField(term8754, term8754.getClass(), "preserveWhitespace", false);
        setBooleanField(term8754, term8754.getClass(), "formList", false);
        setBooleanField(term8754, term8754.getClass(), "formSubmit", true);
        setField(term8753, term8753.getClass(), "tag", term8754);
        setField(term8775, term8775.getClass(), "referent", null);
        setField(term8776, term8776.getClass(), "lock", term8777);
        setField(term8776, term8776.getClass(), "head", null);
        setLongField(term8776, term8776.getClass(), "queueLength", 3133860696238261492L);
        setField(term8775, term8775.getClass(), "queue", term8776);
        setField(term8775, term8775.getClass(), "next", null);
        setField(term8775, term8775.getClass(), "discovered", null);
        setField(term8753, term8753.getClass(), "shadowChildrenRef", term8775);
        setField(term8753, term8753.getClass(), "childNodes", term8779);
        setIntField(term8783, term8783.getClass(), "size", 1743683601);
        setField(term8783, term8783.getClass(), "keys", term8785);
        setField(term8783, term8783.getClass(), "vals", term8786);
        setField(term8753, term8753.getClass(), "attributes", term8783);
        setField(term8753, term8753.getClass(), "baseUri", "vOuMEpOQAg");
        setField(term8753, term8753.getClass(), "parentNode", null);
        setIntField(term8753, term8753.getClass(), "siblingIndex", -945116798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term8753, args);
    }

};


