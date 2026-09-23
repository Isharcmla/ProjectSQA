package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407932;
     Object term410711;

    public DurationFormatUtils_format_1779347976481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term408813 = new StringBuffer();
        StringBuffer term409099 = new StringBuffer();
        StringBuffer term409271 = new StringBuffer();
        term407932 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 10);
        Object term408755 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term408927 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term409041 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term409213 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term409385 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term409499 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term409537 = newInstance(Class.forName("java.lang.Object"));
        Object term409651 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term408488 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term409765 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term409803 = newInstance(Class.forName("java.lang.Object"));
        Object term409917 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410031 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term408755, term408755.getClass(), "value", term408813);
        setIntField(term408755, term408755.getClass(), "count", 0);
        setElement(term407932, 0, term408755);
        setField(term408927, term408927.getClass(), "value", term408755);
        setIntField(term408927, term408927.getClass(), "count", 0);
        setElement(term407932, 1, term408927);
        setField(term409041, term409041.getClass(), "value", term409099);
        setIntField(term409041, term409041.getClass(), "count", 0);
        setElement(term407932, 2, term409041);
        setField(term409213, term409213.getClass(), "value", term409271);
        setIntField(term409213, term409213.getClass(), "count", 0);
        setElement(term407932, 3, term409213);
        setField(term409385, term409385.getClass(), "value", term409099);
        setIntField(term409385, term409385.getClass(), "count", 0);
        setElement(term407932, 4, term409385);
        setField(term409499, term409499.getClass(), "value", term409537);
        setIntField(term409499, term409499.getClass(), "count", 0);
        setElement(term407932, 5, term409499);
        setField(term409651, term409651.getClass(), "value", term408488);
        setIntField(term409651, term409651.getClass(), "count", 0);
        setElement(term407932, 6, term409651);
        setField(term409765, term409765.getClass(), "value", term409803);
        setIntField(term409765, term409765.getClass(), "count", 0);
        setElement(term407932, 7, term409765);
        setElement(term407932, 8, term409917);
        setElement(term407932, 9, term410031);
        term410711 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 10);
        Object term410712 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410713 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term410716 = (byte[]) newByteArray(16);
        Object term410717 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410718 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410719 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term410722 = (byte[]) newByteArray(16);
        Object term410723 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410724 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term410727 = (byte[]) newByteArray(16);
        Object term410728 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410729 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410730 = newInstance(Class.forName("java.lang.Object"));
        Object term410731 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term410732 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term410733 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410734 = newInstance(Class.forName("java.lang.Object"));
        Object term410735 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410736 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term410713, term410713.getClass(), "toStringCache", "");
        setField(term410713, term410713.getClass(), "value", term410716);
        setByteField(term410713, term410713.getClass(), "coder", (byte) 0);
        setIntField(term410713, term410713.getClass(), "count", 0);
        setField(term410712, term410712.getClass(), "value", term410713);
        setIntField(term410712, term410712.getClass(), "count", 0);
        setElement(term410711, 0, term410712);
        setField(term410717, term410717.getClass(), "value", term410712);
        setIntField(term410717, term410717.getClass(), "count", 0);
        setElement(term410711, 1, term410717);
        setField(term410719, term410719.getClass(), "toStringCache", "");
        setField(term410719, term410719.getClass(), "value", term410722);
        setByteField(term410719, term410719.getClass(), "coder", (byte) 0);
        setIntField(term410719, term410719.getClass(), "count", 0);
        setField(term410718, term410718.getClass(), "value", term410719);
        setIntField(term410718, term410718.getClass(), "count", 0);
        setElement(term410711, 2, term410718);
        setField(term410724, term410724.getClass(), "toStringCache", "");
        setField(term410724, term410724.getClass(), "value", term410727);
        setByteField(term410724, term410724.getClass(), "coder", (byte) 0);
        setIntField(term410724, term410724.getClass(), "count", 0);
        setField(term410723, term410723.getClass(), "value", term410724);
        setIntField(term410723, term410723.getClass(), "count", 0);
        setElement(term410711, 3, term410723);
        setField(term410728, term410728.getClass(), "value", term410719);
        setIntField(term410728, term410728.getClass(), "count", 0);
        setElement(term410711, 4, term410728);
        setField(term410729, term410729.getClass(), "value", term410730);
        setIntField(term410729, term410729.getClass(), "count", 0);
        setElement(term410711, 5, term410729);
        setField(term410731, term410731.getClass(), "value", term410732);
        setIntField(term410731, term410731.getClass(), "count", 0);
        setElement(term410711, 6, term410731);
        setField(term410733, term410733.getClass(), "value", term410734);
        setIntField(term410733, term410733.getClass(), "count", 0);
        setElement(term410711, 7, term410733);
        setField(term410735, term410735.getClass(), "value", null);
        setIntField(term410735, term410735.getClass(), "count", 0);
        setElement(term410711, 8, term410735);
        setField(term410736, term410736.getClass(), "value", null);
        setIntField(term410736, term410736.getClass(), "count", 0);
        setElement(term410711, 9, term410736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term407932;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term407932, term410711));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


