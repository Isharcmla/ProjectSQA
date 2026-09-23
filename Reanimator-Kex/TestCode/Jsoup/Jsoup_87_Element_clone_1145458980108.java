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

public class Element_clone_1145458980108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55692;

    public Element_clone_1145458980108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55718 = new ArrayList();
        ((ArrayList) term55718).add((Object)null);
        ((ArrayList) term55718).add((Object)null);
        ((ArrayList) term55718).add((Object)null);
        ((ArrayList) term55718).add((Object)null);
        ((ArrayList) term55718).add((Object)null);
        term55692 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55693 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55714 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55715 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55716 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55722 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55724 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55725 = (Object[]) newArray("java.lang.String", 0);
        setField(term55693, term55693.getClass(), "tagName", "pvDEABOxLt");
        setBooleanField(term55693, term55693.getClass(), "isBlock", false);
        setBooleanField(term55693, term55693.getClass(), "formatAsBlock", false);
        setBooleanField(term55693, term55693.getClass(), "canContainInline", false);
        setBooleanField(term55693, term55693.getClass(), "empty", true);
        setBooleanField(term55693, term55693.getClass(), "selfClosing", true);
        setBooleanField(term55693, term55693.getClass(), "preserveWhitespace", true);
        setBooleanField(term55693, term55693.getClass(), "formList", false);
        setBooleanField(term55693, term55693.getClass(), "formSubmit", true);
        setField(term55692, term55692.getClass(), "tag", term55693);
        setField(term55714, term55714.getClass(), "referent", null);
        setField(term55715, term55715.getClass(), "lock", term55716);
        setField(term55715, term55715.getClass(), "head", null);
        setLongField(term55715, term55715.getClass(), "queueLength", -1832940336320585644L);
        setField(term55714, term55714.getClass(), "queue", term55715);
        setField(term55714, term55714.getClass(), "next", null);
        setField(term55714, term55714.getClass(), "discovered", null);
        setField(term55692, term55692.getClass(), "shadowChildrenRef", term55714);
        setField(term55692, term55692.getClass(), "childNodes", term55718);
        setIntField(term55722, term55722.getClass(), "size", 993388358);
        setField(term55722, term55722.getClass(), "keys", term55724);
        setField(term55722, term55722.getClass(), "vals", term55725);
        setField(term55692, term55692.getClass(), "attributes", term55722);
        setField(term55692, term55692.getClass(), "baseUri", "beAMpkroCQ");
        setField(term55692, term55692.getClass(), "parentNode", null);
        setIntField(term55692, term55692.getClass(), "siblingIndex", -765191335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term55692, args);
    }

};


