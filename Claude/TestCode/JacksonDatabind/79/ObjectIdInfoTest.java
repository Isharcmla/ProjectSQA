import org.junit.Test;
import org.junit.Assert;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;

public class ObjectIdInfoTest {

    // ---------- Constructor: (PropertyName, Class scope, Class gen, Class resolver) ----------

    @Test
    public void testConstructor_withResolver_normalInput_fieldsSetCorrectly() {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, SimpleObjectIdResolver.class);

        Assert.assertEquals(name, info.getPropertyName());
        Assert.assertEquals(Object.class, info.getScope());
        Assert.assertNull(info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testConstructor_withNullResolver_defaultsToSimpleObjectIdResolver() {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, null);

        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    @Test
    public void testConstructor_withResolver_nullScopeAndName_allowed() {
        ObjectIdInfo info = new ObjectIdInfo((PropertyName) null, null, null, SimpleObjectIdResolver.class);

        Assert.assertNull(info.getPropertyName());
        Assert.assertNull(info.getScope());
        Assert.assertNull(info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    // ---------- Deprecated Constructor: (PropertyName, Class scope, Class gen) ----------

    @Test
    public void testDeprecatedConstructor_propertyNameVersion_normalInput_fieldsSetCorrectly() {
        PropertyName name = new PropertyName("objId");
        ObjectIdInfo info = new ObjectIdInfo(name, String.class, null);

        Assert.assertEquals(name, info.getPropertyName());
        Assert.assertEquals(String.class, info.getScope());
        Assert.assertNull(info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    // ---------- Deprecated Constructor: (String name, Class scope, Class gen) ----------

    @Test
    public void testDeprecatedConstructor_stringNameVersion_normalInput_fieldsSetCorrectly() {
        ObjectIdInfo info = new ObjectIdInfo("myId", Object.class, null);

        Assert.assertNotNull(info.getPropertyName());
        Assert.assertEquals("myId", info.getPropertyName().getSimpleName());
        Assert.assertEquals(Object.class, info.getScope());
        Assert.assertNull(info.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        Assert.assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testDeprecatedConstructor_stringNameVersion_emptyString_allowed() {
        ObjectIdInfo info = new ObjectIdInfo("", Object.class, null);

        Assert.assertNotNull(info.getPropertyName());
        Assert.assertEquals("", info.getPropertyName().getSimpleName());
    }

    // ---------- withAlwaysAsId ----------

    @Test
    public void testWithAlwaysAsId_sameState_returnsSameInstance() {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, SimpleObjectIdResolver.class);

        ObjectIdInfo result = info.withAlwaysAsId(false);

        Assert.assertSame(info, result);
    }

    @Test
    public void testWithAlwaysAsId_differentState_returnsNewInstanceWithUpdatedState() {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, SimpleObjectIdResolver.class);

        ObjectIdInfo result = info.withAlwaysAsId(true);

        Assert.assertNotSame(info, result);
        Assert.assertTrue(result.getAlwaysAsId());
        Assert.assertEquals(name, result.getPropertyName());
        Assert.assertEquals(Object.class, result.getScope());
        Assert.assertNull(result.getGeneratorType());
        Assert.assertEquals(SimpleObjectIdResolver.class, result.getResolverType());
    }

    @Test
    public void testWithAlwaysAsId_toggleTwice_returnsToOriginalState() {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, SimpleObjectIdResolver.class);

        ObjectIdInfo toggledOnce = info.withAlwaysAsId(true);
        ObjectIdInfo toggledTwice = toggledOnce.withAlwaysAsId(false);

        Assert.assertFalse(toggledTwice.getAlwaysAsId());
    }

    // ---------- Getters ----------

    @Test
    public void testGetPropertyName_returnsCorrectValue() {
        PropertyName name = new PropertyName("propName");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, SimpleObjectIdResolver.class);

        Assert.assertEquals(name, info.getPropertyName());
    }

    @Test
    public void testGetScope_returnsCorrectValue() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("x"), String.class, null, SimpleObjectIdResolver.class);

        Assert.assertEquals(String.class, info.getScope());
    }

    @Test
    public void testGetGeneratorType_returnsNullWhenNotSet() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("x"), Object.class, null, SimpleObjectIdResolver.class);

        Assert.assertNull(info.getGeneratorType());
    }

    @Test
    public void testGetResolverType_returnsCorrectValue() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("x"), Object.class, null, SimpleObjectIdResolver.class);

        Assert.assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    @Test
    public void testGetAlwaysAsId_defaultsToFalse() {
        ObjectIdInfo info = new ObjectIdInfo(new PropertyName("x"), Object.class, null, SimpleObjectIdResolver.class);

        Assert.assertFalse(info.getAlwaysAsId());
    }

    // ---------- toString ----------

    @Test
    public void testToString_withNullScopeAndGenerator_containsNullText() {
        ObjectIdInfo info = new ObjectIdInfo((PropertyName) null, null, null, SimpleObjectIdResolver.class);

        String result = info.toString();

        Assert.assertTrue(result.contains("scope=null"));
        Assert.assertTrue(result.contains("generatorType=null"));
        Assert.assertTrue(result.contains("alwaysAsId=false"));
    }

    @Test
    public void testToString_withNonNullScope_containsScopeName() {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, SimpleObjectIdResolver.class);

        String result = info.toString();

        Assert.assertTrue(result.contains("scope=" + Object.class.getName()));
        Assert.assertTrue(result.contains("propName=" + name));
    }

    @Test
    public void testToString_withAlwaysAsIdTrue_containsTrueText() {
        PropertyName name = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(name, Object.class, null, SimpleObjectIdResolver.class)
                .withAlwaysAsId(true);

        String result = info.toString();

        Assert.assertTrue(result.contains("alwaysAsId=true"));
    }
}
